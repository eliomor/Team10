<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="windows-1255">
<title>Login</title>
</head>
<body>
	<form method="post" action="LoginCheck">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="login"></td>
			</tr>
		</table>
	</form>

</body>
</html>