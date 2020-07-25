// localStorage.clear();

// function getC() {
//   fetch("https://jsonplaceholder.typicode.com/posts")
//     .then(function (res) {
//       return res.json();
//     })
//     .then(function (data) {
//       console.log(data);
//       localStorage.setItem("call", data[0].body);
//       console.log(localStorage.getItem("call"));
//     })
//     .catch(function () {
//       console.log("Error");
//     });
// }

// getC();

function add(a, b, fn) {
  setTimeout(() => {
    console.log("executing now");
    fn(a + b);
  }, 10000);
}

add(10, 20, function (r) {
  console.log(r);
});

console.log("end of program");
