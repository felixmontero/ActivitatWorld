<%@ page isELIgnored="false" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <title>New City</title>

<link rel="stylesheet" href="/css/login.css">

</head>
<body style="background-image: url(https://img.freepik.com/vector-gratis/fondo-geometrico_23-2148573776.jpg?w=2000);">
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