var students = [];

var name = $("#name");
var studentDiv = $("#student_div");

$("<button/>")
  .text("Add student")
  .click(function () {
    addStudent();
  });

fetchStudents();

function fetchStudents() {
  $.get(
    "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
    function (response, status) {
      if (status == "success") {
        console.log(response);
        students = response;
        displayStudents();
      }
    }
  );
}

function displayStudents() {
  var studentsDiv = $("<div/>");
  var table = "<table>";
  table +=
    "<tr><th>ID</th><th>Student Name</th><th>Email</th><th>Date</th><th>Roll No</th><th>Is Male</th><th>Age</th></tr>";
  students.forEach((student, index) => {
    table +=
      "<tr><td>" +
      student.id +
      "</td><td>" +
      student.name +
      "</td><td>" +
      student.email +
      "</td><td>" +
      student.date +
      "</td><td>" +
      student.rollNo +
      "</td><td>" +
      student.isMale +
      "</td><td>" +
      student.age +
      "</td><td><button id=" +
      index +
      " onclick=remove('" +
      student.id +
      "')>Remove</button></td></tr>";
  });
  table += "</table>";

  studentsDiv.append(table);
  studentDiv.empty();
  studentDiv.append(studentsDiv);
}

function remove(index) {
  $.ajax({
    url:
      "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + index,
    type: "DELETE",
    success: function (response) {
      console.log(response);
    },
  });
  fetchStudents();
}

function addStudent() {
  var student = {
    age: $("#age").val(),
    name: $("#name").val(),
    email: $("#email").val(),
    date: $("#date").val(),
    isMale: $("#is_male").val(),
    rollNo: $("#roll_num").val(),
  };
  $.post(
    "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
    student,
    function (response) {
      console.log(response);
      fetchStudents();
    }
  );
}

function editStudent() {
  var student = {
    age: $("#age").val(),
    name: $("#name").val(),
    email: $("#email").val(),
    date: $("#date").val(),
    isMale: $("#is_male").val(),
    rollNo: $("#roll_num").val(),
  };

  var fullUrl =
    "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" +
    $("#student_id").val();

  console.log(fullUrl);

  $.ajax({
    url: fullUrl,
    data: student,
    type: "PUT",
    success: function (response) {
      console.log(response);
      fetchStudents();
    },
  });
}
