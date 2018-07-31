<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Employee Login</title>
<link rel="stylesheet" href="css/login.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
body {
    background:  url("images/emp1.jpg") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;  

}
</style>
<body>
<center>
<form action="EmployeeCon" method="post" style="max-width:500px;margin:auto">
  <h2>Employee Register</h2>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Name" name="ename">
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="eemail">
  </div>
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="text" placeholder="password" name="epass">
  </div>
  
  <div class="input-container">
    <i class="fa fa-address-book icon"></i>
    <input class="input-field" type="text" placeholder="Address" name="eaddress">
  </div>
    
    <div class="input-container">
    <i class="fa fa-calendar icon"></i>
    <input class="input-field" type="text" placeholder="age" name="eage">
  </div>
  <div class="input-container">
    <i class="fa fa-briefcase icon"></i>
    <input class="input-field" type="password" placeholder="qualification" name="equalification">
  </div>

  <button type="submit" class="btn">Register</button>
</form>


</center>


</body>
</html>