const createDiv = document.getElementById("add_div");
const addTaskText = document.getElementById("add_task");
const addTimeText = document.getElementById("add_time");
const taskList = document.getElementById("task_list");
const addTaskButton = document.getElementById("add_button");

const tasks = [];

addTaskButton.addEventListener("click", addTask);

display();

function addTask() {
  tasks.push({
    taskName: addTaskText.value,
    taskTime: addTimeText.value,
  });

  display();
}

function remove(index) {
  tasks.splice(index, 1);
  display();
}

function display() {
  if (document.contains(document.getElementById("showTasks"))) {
    document.getElementById("showTasks").remove();
  }

  var showTasksDiv = document.createElement("div");
  showTasksDiv.id = "showTasks";
  tasks.forEach((element, index) => {
    var taskName = document.createElement("p");
    var taskTime = document.createElement("p");
    var removeButton = document.createElement("button");
    removeButton.innerHTML = "Remove Task";
    removeButton.addEventListener("click", function () {
      remove(index);
    });

    taskName.innerHTML = index + ") " + element.taskName;
    taskTime.innerHTML = "At " + element.taskTime;

    showTasksDiv.appendChild(taskName);
    showTasksDiv.appendChild(taskTime);
    showTasksDiv.appendChild(removeButton);
  });

  taskList.appendChild(showTasksDiv);
}
