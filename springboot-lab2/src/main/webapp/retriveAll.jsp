<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Trainees</h1>
<table class="col-mid-4" border="1">
<tr>
<th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${traineelist }" var="trainee">
        <tr>
            <td>${trainee.traineeId }</td>
            <td>${trainee.traineeName }</td>
            <td>${trainee.traineeLocation }</td>
            <td>${trainee.traineeDomain }</td>
        </tr>
        </c:forEach>
</table>
<form action="manage.jsp">
 <input type="submit" value="home">
 </form>
 
</body>
</html>
