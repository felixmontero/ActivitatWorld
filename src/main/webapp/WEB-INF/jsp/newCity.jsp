<%@ page isELIgnored="false" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
          <meta charset="UTF-8" />
          <meta http-equiv="X-UA-Compatible" content="IE=edge" />
          <meta name="viewport" content="width=device-width, initial-scale=1.0" />
 <title>New City</title>

<link rel="stylesheet" href="/css/login.css">

</head>
<body style="background-image: url(https://img.freepik.com/vector-gratis/fondo-geometrico_23-2148573776.jpg?w=2000);">
<header>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/countries">Countries</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </nav>
   </header>

<div id="login-form-wrap">
<div class="form-field">
 <h2>New City from ${name}</h2>
</div>
   <c:if test="${not empty message}">
   ${message}
   </c:if>
     <form action="/newCity/${code}" method="post">
            <label for="nameCity">Name:</label>
            <input type="text" name="nameCity" id="nameCity" placeholder="City Name" required>
            <label for="district">District:</label>
            <select name="district" id="district">
                <c:forEach var="district" items="${districts}">
                    <option value="${district.name}">${district.name}</option>
                </c:forEach>
            </select>
            <label for="population">Population</label>
            <input type="number" name="population" id="population" required>
            <input type="submit" value="Create">
        </form>
</div>
</body>
</html>