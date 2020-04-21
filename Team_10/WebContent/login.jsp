<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<form method="post" action="loginCheck.jsp">
<div class="container-fluid">
	<div class="row">
	
		   <div class="col-md-3"></div>
				
		   <div class="col-md-6 col-sm-6 col-xs-12">
			     <div class="jumbotron">
				 		
				 		<h1 class="text-center">Login Page</h1>
				 	     <br>
				 	     <p class="text-denger">${error}</p>
				 	     <div class="form-group">
				 	     	  <label class="control-Label" for="Password">User Id:</label>
				 	     	  <input type="text" name="id" class="form-control" placeholder="Input Id">		 	     
				 	     </div>
				 	     
 				 	     <div class="form-group">
 				 	     	  <label class="control-Label" for="Password">Password:</label>
				 	     	  <input type="Password" name="Password" class="form-control" placeholder="Input Password">
 				 	     </div>	 	
 				 	     <input type="checkbox" name="remember"> Remember Me?
 				 	     <br><br>
 				 	     <div class="pull-right">
 				 	   	 	 <button type="submit" class="btn btn-outline-warning">Login</button>
 				 	    	 <button type="reset" class="btn btn-outline-dark">Close</button>
 				 	     </div>     
				 </div>
	      </div>
	      <div class="col-md-3"></div>	                                                                                                                                                                                                                                                               
    </div>
</div>  
</form>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>