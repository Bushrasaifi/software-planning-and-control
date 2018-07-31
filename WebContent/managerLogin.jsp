<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ManagerLogin</title>
<link rel="stylesheet" href="css/login.css"/>
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
<style>
body {
    background:  url("images/bacck.jpg") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;  

}
</style>
</head>
<body>
<center>
<form action="ManagerCon" method="post" style="max-width:500px;margin:auto">
  <h2>Manager Login</h2>
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
    <input class="input-field" type="password" placeholder="Password" name="mpass">
  </div>

  <button type="submit" class="btn">Login</button>
</form>


</center>
</body>
</html>