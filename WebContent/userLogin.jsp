<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="css/user.css"/>
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
 <style>
body{
font-family: Arial, Helvetica, sans-serif;
    background:  url("images/UserLoginBackground.png") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;  

}

</style>
</head>
<body>
<center>
<form action="UserConLogin" method="post">
  <div class="container">
    <h1 style=color:blue><b>UserLogin</b></h1>
    <hr>
    <input type="text" placeholder="Enter UserName" name="username" required><br>
    
 
    <input type="password" placeholder="Enter Password" name="upass" required><br>
    
    

   
    <button type="submit" class="registerbtn">Login</button>
  </div>

  <div class="container signin">
    <p>Don't have an account? <a href="register.jsp">Register</a></p>
  </div>
</form> 
</center>
</body>
</html>