<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>update Operation</h1>
<!--  <form action="/modifytrainee" method="post">
<table class="col-mid-4" border="1">

<tr>
<td>
Please enter trainee ID
</td>
<td>
<input type="number" name="traineeId">
</td>
<td>
<button type="submit">search</button>
</td>
</tr>
</table>
</form>
-->
<form action="/updatetrainee" method="post">
<h1>Trainee Info</h1>
<br>
<table class="col-mid-4" border="1">
<tr>
<td>Trainee ID</td>
<td><input type="number" name="traineeId"> </td>
</tr>
<tr>
<td>Trainee Name</td>
<td><input type="text" name="traineeName"> </td>
</tr>
<tr>
<td>Trainee Domain</td>
<td><input type="text" name="traineeDomain"> </td>
</tr>
<tr>
<td>Trainee Location</td>
<td><input type="text" name="traineeLocation"> </td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update"> </td>
</tr>
</table>

</form>
</body>
</html>