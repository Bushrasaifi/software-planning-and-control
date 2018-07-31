<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/user.css"/>
<style>
body{
font-family: Arial, Helvetica, sans-serif;
    background:  url("images/EmployeeLoginBackground.png") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;  

}

</style>
</head>
<body>
<center>
<form action="EmployeeConLogin" method="post">
<div class="container">
    <h1 style=color:blue><b> Employee Login</b></h1>
    <hr>
    <input type="text" placeholder="Enter Name" name="name" required><br>
    
 
    <input type="password" placeholder="Enter Password" name="pass" required><br>
    
    

   
    <button type="submit" class="registerbtn">Login</button>
  </div>
  </form>

</center>
</body>
</html>