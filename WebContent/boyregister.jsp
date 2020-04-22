<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
</head>
<body  style="background-color:powderblue;">
<h1> Registration from</h1>
	<div class="boyregister">
	<form method="post" id="register" action ="login.jsp">
		 <h2>Register Here</h2>
		  <label> ID boy:</label><br>
		 <input type="number" name="boyId" id="number"
		 placeholder="Enter your id"><br><br>
		 <label> first name parent:</label><br>
		 <input type="text" name="Fname" id="name"
		 placeholder="Enter parent first name"><br><br>
		 <label> Last  name parent:</label><br>
		 <input type="text" name="lname" id="name"
		 placeholder="Enter parent last name"><br><br>
		 <label> first name boy:</label><br>
		 <input type="text" name="Fname" id="name"
		 placeholder="Enter boy first name"><br><br>
		 <label> Last  name boy:</label><br>
		 <input type="text" name="lname" id="name"
		 placeholder="Enter boy last name"><br><br>
		 <label> mobile number:</label><br>
		 <select id="ph">
		 	<option>050</option>
		 	<option>054</option>
		 	<option>053</option>
		 	<option>052</option>
		 	<option>059</option>
		 	</select>
		 <input type="number" name="Mnum" id="number"
		 placeholder="Enter your number"><br><br>
		 <label> Email:</label><br>
		 <input type="email" name="email" id="name"
		 placeholder="Enter your email"><br><br>
		 <label> Address:</label><br>
		 <input type="text" name="address" id="name"
		 placeholder="Enter your address"><br><br>
		 <label>password:</label><br>
		 <input type="password" name="pass" id="name"
		 placeholder="Enter  your password"><br><br>
		 <label> re enter password:</label><br>
		 <input type="password" name="pass" id="name"
		 placeholder="Enter password"><br><br>
		 <input  type="radio" name="male" id="male"><span id="male">&nbsp;male</span>&nbsp;&nbsp;
		 <input  type="radio" name="female" id="female"><span id="female">&nbsp;male</span>&nbsp;&nbsp;<br><br>
		 <input type="submit" value="Submit" id="sub">
		 
		 
		 
	 
	 </form>
	 </div>
</body>
</html>