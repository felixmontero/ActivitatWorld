<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Països</title>
  </head>

  <body  style="background-image: url(https://wallpapers.com/images/hd/white-textured-paper-439vozmsl9bybc8a.jpg);">
     <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <a class="navbar-brand" href="/countries">Countries</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
        </nav>
     </header>

    <h1>Countries</h1>

    <table  class="table">
    <thead class="thead-dark">
      <tr>
        <th scope="col">Code</th>
        <th scope="col">Name</th>
        <th scope="col">Cities</th>
        <th scope="col">Languages</th>
        <th scope="col">Create City</th>
      </tr>
      </thead>

      <c:forEach var="country" items="${countries}">
        <tr>
          <td scope="row" class="table-light">${country.code}</td>
          <td scope="row" class="table-light">${country.name}</td>
          <td scope="row" class="table-light"><a href="/cities/${country.code}/${country.name}">Cities</a></td>
          <td scope="row" class="table-light"><a href="/languages/${country.code}/${country.name}">Languages</a></td>
          <td scope="row" class="table-light"><a href="/newCity/${country.code}/${country.name}">New City</a></td>
        </tr>
      </c:forEach>

    </table>

      <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>