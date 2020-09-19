$.get("http://restcountries.eu/rest/v2/all", function (response, status) {
  if (status == "success") {
    console.log(response);
    displayCountries(response);
  }
});

function displayCountries(data) {
  var countriesDiv = $("<div/>");
  var table = "<table>";
  table += "<tr><th>Country</th><th>Capital</th><th>Flag</th></tr>";
  data.forEach((country) => {
    table +=
      "<tr><td>" +
      country.name +
      "</td><td>" +
      country.capital +
      "</td><td>" +
      '<img src="' +
      country.flag +
      '" height="50" width="50">' +
      "</td></tr>";
  });
  table += "</table>";

  countriesDiv.append(table);
  $("body").append(countriesDiv);
}
