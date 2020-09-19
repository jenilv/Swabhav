const createDiv = document.getElementById("add_div");
const addTaskText = document.getElementById("add_task");
const addTimeText = document.getElementById("add_time");
const pendingTaskList = document.getElementById("pending_task_list");
const doneTaskList = document.getElementById("done_task_list");
const addTaskButton = document.getElementById("add_button");
var pendingTasks;
var doneTasks;

if (localStorage.getItem("pendingTasks") != null) {
  pendingTasks = JSON.parse(localStorage.getItem("pendingTasks"));
} else {
  pendingTasks = [];
}

if (localStorage.getItem("doneTasks") != null) {
  doneTasks = JSON.parse(localStorage.getItem("doneTasks"));
} else {
  doneTasks = [];
}

displayDone();
displayPending();

addTaskButton.addEventListener("click", addTask);

function addTask() {
  pendingTasks.push({
    taskName: addTaskText.value,
    taskTime: addTimeText.value,
  });

  localStorage.setItem("pendingTasks", JSON.stringify(pendingTasks));

  displayPending();
}

function remove(index) {
  pendingTasks.splice(index, 1);
  localStorage.setItem("pendingTasks", JSON.stringify(pendingTasks));
  displayPending();
  displayDone();
}

function markAsDone(index) {
  var obj = pendingTasks[index];
  doneTasks.push(obj);
  localStorage.setItem("doneTasks", JSON.stringify(doneTasks));
  pendingTasks.splice(index, 1);
  localStorage.setItem("pendingTasks", JSON.stringify(pendingTasks));
  displayPending();
  displayDone();
}

function displayPending() {
  if (document.contains(document.getElementById("showPendingTasks"))) {
    document.getElementById("showPendingTasks").remove();
  }

  var showTasksDiv = document.createElement("div");
  showTasksDiv.id = "showPendingTasks";
  pendingTasks.forEach((element, index) => {
    var taskName = document.createElement("p");
    var taskTime = document.createElement("p");
    var removeButton = document.createElement("button");
    var markAsDoneButton = document.createElement("button");
    markAsDoneButton.innerHTML = "Mark As Done";
    removeButton.innerHTML = "Remove Task";
    removeButton.addEventListener("click", function () {
      remove(index);
    });
    markAsDoneButton.addEventListener("click", function () {
      markAsDone(index);
    });

    taskName.innerHTML = index + ") " + element.taskName;
    taskTime.innerHTML = "At " + element.taskTime;

    showTasksDiv.appendChild(taskName);
    showTasksDiv.appendChild(taskTime);
    showTasksDiv.appendChild(removeButton);
    showTasksDiv.appendChild(markAsDoneButton);
  });

  pendingTaskList.appendChild(showTasksDiv);
}

function displayDone() {
  if (document.contains(document.getElementById("showDoneTasks"))) {
    document.getElementById("showDoneTasks").remove();
  }

  var showTasksDiv = document.createElement("div");
  showTasksDiv.id = "showDoneTasks";

  doneTasks.forEach((element, index) => {
    var taskName = document.createElement("p");
    var taskTime = document.createElement("p");
    taskName.innerHTML = index + ") " + element.taskName;
    taskTime.innerHTML = "Time: " + element.taskTime;

    showTasksDiv.appendChild(taskName);
    showTasksDiv.appendChild(taskTime);
  });

  doneTaskList.appendChild(showTasksDiv);
}
