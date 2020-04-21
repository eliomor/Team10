<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import=Meonot.ManagerDao %>
<jsp:useBean id='man' class='Meonot.Manager'></jsp:useBean>
<jsp:setProperty property='prototype' name='man'/>
<%
String id=request.getParameter("id");
if(ManagerDao.login(id))
	response.sendRedirect("managerPage.jsjp");
else response.sendRedirect("login.jsjp");
	

%>
</body>
</html>