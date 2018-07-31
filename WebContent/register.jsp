<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/user.css"/>
</head>
<body>
<center>
<form action="UserCon" method="post">
  <div class="container">
    <h1 style=color:blue><b>Register</b></h1>
    <hr>
     <input type="text" placeholder="Enter Name" name="uname" required><br>
    
    <input type="text" placeholder="Enter UserName" name="uUsername" required><br>
    
    
    <input type="text" placeholder="Enter Email" name="uemail" required><br>
    
    <input type="radio">Male
  <input type="radio">Female<br><br>
  
  <input type="date" placeholder="Enter DOB" name="dob" required><br><br>
  
    <input type="text" placeholder="Enter Address" name="uaddress" required><br>
    

 
    <input type="password" placeholder="Enter Password" name="upass" required><br>
    
    <input type="text" placeholder="Enter City" name="ucity" required><br>

  
    <hr>

   
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="userLogin.jsp">Login</a>.</p>
  </div>
</form>
</center>
</body>
</html>