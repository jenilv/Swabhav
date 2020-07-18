const questions = [
  {
    question: "Question number 1",
    options: {
      a: "q1 Option a",
      b: "q1 Option b",
      c: "q1 Option c",
      d: "q1 Option d",
    },
    answer: "a",
    selected: null,
  },
  {
    question: "Question number 2",
    options: {
      a: "q2 Option a",
      b: "q2 Option b",
      c: "q2 Option c",
      d: "q2 Option d",
    },
    answer: "a",
    selected: null,
  },
  {
    question: "Question number 3",
    options: {
      a: "q3 Option a",
      b: "q3 Option b",
      c: "q3 Option c",
      d: "q3 Option d",
    },
    answer: "b",
    selected: null,
  },
  {
    question: "Question number 4",
    options: {
      a: "q4 Option a",
      b: "q4 Option b",
      c: "q4 Option c",
      d: "q4 Option d",
    },
    answer: "c",
    selected: null,
  },
  {
    question: "Question number 5",
    options: {
      a: "q5 Option a",
      b: "q5 Option b",
      c: "q5 Option c",
      d: "q5 Option d",
    },
    answer: "a",
    selected: null,
  },
];
var nextButton = document.createElement("button");
var previousButton = document.createElement("button");
var submitButton = document.createElement("button");
var buttonDiv = document.createElement("div");

var currentQuestion = -1;

function init() {
  document.body.appendChild(buttonDiv);
  nextButton.innerHTML = "Next Question";
  previousButton.innerHTML = "Previous Question";
  submitButton.innerHTML = "Submit";
  nextButton.addEventListener("click", displayNextQuestion);
  previousButton.addEventListener("click", displayPreviousQuestion);
  submitButton.addEventListener("click", submit);
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
  document.body.appendChild(question);
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
  document.body.appendChild(question);
}

function submit() {
  if (confirm("Are you sure you want to submit?")) {
    var nodes = buttonDiv.childNodes;
    for (let index = 0; index < nodes.length; index++) {
      nodes[index].disabled = true;
    }
    if (document.contains(document.getElementById("questionDiv"))) {
      document.getElementById("questionDiv").remove();
    }
    displayAnswers();
  }
}

function displayAnswers() {
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
  document.body.appendChild(answerDiv);
  document.body.appendChild(correctAnswers);
}

function createQuestionDiv(question) {
  var questionDiv = document.createElement("div");
  questionDiv.id = "questionDiv";

  var p = document.createElement("p");
  p.innerHTML = question.question;
  questionDiv.appendChild(p);

  var selected = question.selected;
  Object.keys(question.options).forEach((element) => {
    createRadioElement(
      questionDiv,
      element,
      question.options[element],
      selected
    );
    questionDiv.appendChild(document.createElement("br"));
  });

  return questionDiv;
}

function setSelected(key) {
  var que = questions[currentQuestion];
  que.selected = key;
  questions[currentQuestion] = que;
}

function createRadioElement(queDiv, key, value, selected) {
  var label = document.createElement("label");

  var element = document.createElement("input");
  element.setAttribute("type", "radio");
  element.setAttribute("value", "option");
  element.setAttribute("name", "option");
  element.setAttribute("id", key);

  if (selected != null && selected == key) {
    element.checked = true;
  }
  element.addEventListener("click", function () {
    setSelected(key);
  });
  label.innerHTML += value;

  queDiv.appendChild(element);
  queDiv.appendChild(label);
}

init();
displayNextQuestion();
