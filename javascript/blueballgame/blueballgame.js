var div = document.getElementById("buttons");
var result = document.getElementById("result");
var number = Math.floor(Math.random() * 51);
var guesses = 0;
var finished = false;

function initiate() {
  for (let index = 1; index <= 50; index++) {
    var button = document.createElement("button");
    button.innerHTML = index;
    button.style.margin = "10px";
    button.style.padding = "10px";
    button.addEventListener("click", process);
    div.appendChild(button);

    if (index % 10 == 0) {
      var button = document.createElement("br");
      div.appendChild(button);
    }
  }
}

function process(event) {
  if (event.target.innerHTML < number) {
    event.target.style.backgroundColor = "red";
  } else if (event.target.innerHTML > number) {
    event.target.style.backgroundColor = "green";
  } else {
    event.target.style.backgroundColor = "blue";
    finished = true;
    result.innerHTML = "Guessed Correct!";
    disableAllBalls();
    return;
  }
  guesses++;

  if (!finished && guesses == 3) {
    result.innerHTML =
      "Game Finished! The blue ball is at position " + number.toString();
    disableAllBalls();
  }
}

function disableAllBalls() {
  var nodes = div.childNodes;
  for (let index = 0; index < nodes.length; index++) {
    nodes[index].disabled = true;
  }
}

function start() {
  document.getElementById("startButton").style.visibility = "hidden";
  initiate();
}
