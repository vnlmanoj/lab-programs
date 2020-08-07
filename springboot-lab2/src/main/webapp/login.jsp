<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="/home" method="post">
<h1>Login Page</h1>
<table class="col-md-4" border="1">
<tr>
<td>Username</td>
<td><input type="text" name="uname" required="required"></td>
</tr>
<tr>

<td>Password</td>
<td><input type="text" name="password" required="required"></td>
</tr>
<tr>
<td></td>
<td><button type="submit">Login</button></td>



</tr>

</table>
${login }
</form>

</body>
</html>