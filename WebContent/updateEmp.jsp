<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
<link rel="stylesheet" href="css/login.css"/>
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
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
  <h2>Employee Update</h2>
  <div class="input-container">
    <input class="input-field" type="text" placeholder="ID" name="ID">
  </div>
  
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Name" name="mname">
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="memail">
  </div>
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="text" placeholder="password" name="pass">
  </div>
  
  <div class="input-container">
    <i class="fa fa-address-book icon"></i>
    <input class="input-field" type="text" placeholder="Address" name="address">
  </div>
   
    <div class="input-container">
    <i class="fa fa-calendar icon"></i>
    <input class="input-field" type="text" placeholder="age" name="age">
  </div>
  <div class="input-container">
    <i class="fa fa-briefcase icon"></i>
    <input class="input-field" type="password" placeholder="qualification" name="qualification">
  </div>

  <button type="submit" class="btn">Update</button>
</form>


</center>


</body>
</html>