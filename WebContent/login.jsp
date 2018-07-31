<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link src="C:\Users\user\Downloads\bootstrap-4.0.0-dist\css"/>
<link href="css/bootstrap.min.css" rel="stylesheet">
  <style>
   body{
  background: url("./images/LoginBackground.jpg") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;    
   }
  </style>  
</head>
<body >
<div class="container-fluid">
<div class="row">
<div class="col-sm-4"><h1>Manager Login</h1>
<a href="managerLogin.jsp"><img src="./images/Manager.png" alt="manager"></a>
</div>
<div class="col-sm-4"><h1>Employee Login</h1><a href="employeeLogin.jsp"><img src="./images/Employee.png" alt="employee"></a></div>
<div class="col-sm-4"><h1>User Login</h1><a href="userLogin.jsp"><img src="./images/User.png" alt="login"></a>
<h2><a href="register.jsp" style="color:yellow">Register first</a></h2></div>
</div>
<center>
<h2><a href="index.jsp">BACK</a></h2>
</center>
</div>
</body>
</html>