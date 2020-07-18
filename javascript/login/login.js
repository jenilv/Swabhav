var usernameError = document.getElementById("usernameError");
var passwordError = document.getElementById("passwordError");
var username = document.getElementById("username");
var password = document.getElementById("password");
var submit = document.getElementById("submit");

function validate() {
  var usernameValue = username.value;
  var passwordValue = password.value;
  if (usernameValue.trim() == "") {
    usernameError.innerHTML = "this is a required field";
    return;
  }
  if (passwordValue.trim() == "") {
    passwordError.innerHTML = "this is a required field";
    return;
  }

  alert("Successful");
}
