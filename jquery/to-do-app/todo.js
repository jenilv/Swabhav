const $createDiv = $("#add_div");
const $addTaskText = $("#add_task");
const $addTimeText = $("#add_time");
const $pendingTaskList = $("#pending_task_list");
const $doneTaskList = $("#done_task_list");
const $addTaskButton = $("#add_button");
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

$addTaskButton.click(addTask);

function addTask() {
  pendingTasks.push({
    taskName: $addTaskText.val(),
    taskTime: $addTimeText.val(),
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
  // if ($(document).find("#showPendingTasks").length > 0) {
  //   $(document).remove("#showPendingTasks");
  // }

  if (document.contains(document.getElementById("showPendingTasks"))) {
    document.getElementById("showPendingTasks").remove();
  }

  var $showTasksDiv = $("<div id='showPendingTasks'/>");
  // showTasksDiv.id = "showPendingTasks";
  pendingTasks.forEach((element, index) => {
    var $taskName = $("<p>" + index + ")" + element.taskName + "</p>").appendTo(
      $showTasksDiv
    );
    var $taskName = $("<p>" + element.taskTime + "</p>").appendTo(
      $showTasksDiv
    );

    var $markAsDoneButton = $("<button>Mark as done</button>")
      .click(function () {
        markAsDone(index);
      })
      .appendTo($showTasksDiv);

    var $removeButton = $("<button>Remove Task</button>")
      .on("click", function () {
        remove(index);
      })

      .appendTo($showTasksDiv);
  });
  $pendingTaskList.append($showTasksDiv);
}

function displayDone() {
  if (document.contains(document.getElementById("showDoneTasks"))) {
    document.getElementById("showDoneTasks").remove();
  }

  var $showTasksDiv = $("<div id='showDoneTasks'/>");
  doneTasks.forEach((element, index) => {
    var $taskName = $("<p>" + index + ")" + element.taskName + "</p>").appendTo(
      $showTasksDiv
    );
    var $taskName = $("<p>" + element.taskTime + "</p>").appendTo(
      $showTasksDiv
    );
  });
  $doneTaskList.append($showTasksDiv);
}
