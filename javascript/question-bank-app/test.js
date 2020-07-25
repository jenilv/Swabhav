// Load google charts
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChart);

const questions = [
  {
    question: "What is Javascript file extension?",
    options: {
      a: ".ts",
      b: ".cs",
      c: ".js",
      d: ".java",
    },
    answer: "c",
    selected: null,
  },
  {
    question: "What is html file extention?",
    options: {
      a: ".py",
      b: ".html",
      c: ".jsp",
      d: ".dll",
    },
    answer: "b",
    selected: null,
  },
  {
    question: "Which is ECMAScript latest edition?",
    options: {
      a: "Edition 11",
      b: "Edition 5",
      c: "Edition 7",
      d: "Edition 9",
    },
    answer: "a",
    selected: null,
  },
  {
    question: "How to add dynamic behaviour in html?",
    options: {
      a: "Using CSS",
      b: "Using Java",
      c: "Using Javascript",
      d: "Cannot add",
    },
    answer: "c",
    selected: null,
  },
  {
    question: "Get element by id in Javascript",
    options: {
      a: "document.getElementById",
      b: "document.getElementByName",
      c: "document.getElementByTag",
      d: "document.getElementByClass",
    },
    answer: "a",
    selected: null,
  },
];
var nextButton = document.createElement("button");
var previousButton = document.createElement("button");
var submitButton = document.createElement("button");
var buttonDiv = document.createElement("div");
var questionsDiv = document.getElementById("questions");
var mainDiv = document.getElementById("main");

var currentQuestion = -1;

function init() {
  insertAfter(questionsDiv, buttonDiv);
  nextButton.innerHTML = "Next Question";
  previousButton.innerHTML = "Previous Question";
  submitButton.innerHTML = "Submit";
  nextButton.addEventListener("click", displayNextQuestion);
  previousButton.addEventListener("click", displayPreviousQuestion);
  submitButton.addEventListener("click", submit);
  previousButton.className = "btn";
  nextButton.className = "btn";
  submitButton.className = "btn";
  previousButton.style.marginRight = "8px";
  nextButton.style.marginRight = "8px";
  buttonDiv.appendChild(previousButton);
  buttonDiv.appendChild(nextButton);
  buttonDiv.appendChild(submitButton);
}

function displayNextQuestion() {
  if (document.contains(document.getElementById("questionDiv"))) {
    document.getElementById("questionDiv").remove();
  }

  var questionDiv = document.createElement("div");
  questionDiv.id = "questionDiv";
  currentQuestion++;

  if (currentQuestion == 4) {
    nextButton.disabled = true;
  }
  if (currentQuestion == 0) {
    previousButton.disabled = true;
  } else {
    previousButton.disabled = false;
  }

  var question = createQuestionDiv(questions[currentQuestion]);
  questionsDiv.appendChild(question);
}

function displayPreviousQuestion() {
  currentQuestion--;
  if (document.contains(document.getElementById("questionDiv"))) {
    document.getElementById("questionDiv").remove();
  }
  if (currentQuestion == 0) {
    previousButton.disabled = true;
  }
  if (currentQuestion != 4) {
    nextButton.disabled = false;
  }

  var question = createQuestionDiv(questions[currentQuestion]);
  questionsDiv.appendChild(question);
}

function submit() {
  if (confirm("Are you sure you want to submit?")) {
    var correct = 0,
      incorrect = 0,
      unanswered = 0;
    questions.forEach((element) => {
      if (element.selected == element.answer) {
        correct++;
      } else if (element.selected == null) {
        unanswered++;
      } else {
        incorrect++;
      }
    });
    var nodes = buttonDiv.childNodes;
    for (let index = 0; index < nodes.length; index++) {
      nodes[index].disabled = true;
    }
    if (document.contains(document.getElementById("questions"))) {
      document.getElementById("questions").remove();
    }
    if (document.contains(buttonDiv)) {
      buttonDiv.remove();
    }
    displayAnswers();
  }
}

function displayAnswers() {
  if (document.contains(mainDiv)) {
    mainDiv.remove();
  }

  var main = document.createElement("div");

  var correct = 0;
  var incorrect = 0;
  var unanswered = 0;
  var answerDiv = document.createElement("div");

  questions.forEach((element) => {
    if (element.selected == element.answer) {
      correct++;
    } else if (element.selected == null) {
      unanswered++;
    } else {
      incorrect++;
    }
    var que = document.createElement("p");
    que.innerHTML = element.question;

    var yourAnswer = document.createElement("p");
    yourAnswer.innerHTML =
      "Your answer: " + element.selected != null
        ? "No answer"
        : element.selected;

    var correctAnswer = document.createElement("p");
    correctAnswer.innerHTML = "Correct answer: " + element.answer;

    que.appendChild(yourAnswer);
    que.appendChild(correctAnswer);
    answerDiv.append(que);
  });

  var correctAnswers = document.createElement("p");
  correctAnswers.innerHTML =
    "Correct answers: " +
    correct +
    "/5 <br/> Incorrect: " +
    incorrect +
    "/5 <br/> Unanswered: " +
    unanswered +
    "/5";
  6;
  answerDiv.style.float = "left";
  answerDiv.style.width = "50%";
  answerDiv.appendChild(correctAnswers);
  main.appendChild(answerDiv);
  // mainDiv.appendChild(correctAnswers);
  var pie = document.createElement("div");
  pie.id = "piechart";
  pie.style.marginLeft = "50%";

  main.appendChild(pie);
  document.body.appendChild(main);

  drawChart(correct, unanswered, incorrect);
}

function createQuestionDiv(question) {
  var questionDiv = document.createElement("div");
  questionDiv.id = "questionDiv";
  questionDiv.style.width = "500px";

  var p = document.createElement("h3");
  p.innerHTML = question.question;
  questionDiv.appendChild(p);

  var selected = question.selected;
  var rbDiv = document.createElement("div");
  rbDiv.style.textAlign = "left";
  rbDiv.style.marginLeft = "20%";

  Object.keys(question.options).forEach((element) => {
    createRadioElement(rbDiv, element, question.options[element], selected);
  });

  questionDiv.appendChild(rbDiv);
  questionDiv.appendChild(document.createElement("br"));

  return questionDiv;
}

function setSelected(key) {
  var que = questions[currentQuestion];
  que.selected = key;
  questions[currentQuestion] = que;
}

function createRadioElement(rbDiv, key, value, selected) {
  var label = document.createElement("label");

  var element = document.createElement("input");
  element.setAttribute("type", "radio");
  element.setAttribute("value", "option");
  element.setAttribute("name", "option");
  element.setAttribute("id", key);
  element.style.marginBottom = "8px";

  if (selected != null && selected == key) {
    element.checked = true;
  }
  element.addEventListener("click", function () {
    setSelected(key);
  });
  label.innerHTML += value;

  rbDiv.appendChild(element);
  rbDiv.appendChild(label);
  rbDiv.appendChild(document.createElement("br"));
}

// Draw the chart and set the chart values
function drawChart(correct, unanswered, incorrect) {
  var data = google.visualization.arrayToDataTable([
    ["Questions", "Result"],
    ["Correct", correct],
    ["Incorrect", incorrect],
    ["Unanswered", unanswered],
  ]);
  // Optional; add a title and set the width and height of the chart
  var options = { title: "Test results", width: 550, height: 400 };
  // Display the chart inside the <div> element with id="piechart"
  var chart = new google.visualization.PieChart(
    document.getElementById("piechart")
  );
  chart.draw(data, options);
}

init();
displayNextQuestion();

function insertAfter(referenceNode, newNode) {
  referenceNode.parentNode.insertBefore(newNode, referenceNode.nextSibling);
}
