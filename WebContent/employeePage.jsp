<%@page import="Pojo.employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Employee Page</title>
<style>
body{background:  url("./images/bck.jpg") no-repeat center center fixed ;
                 -webkit-background-size: cover;
                 background-size: cover ;  
}
.links a{
 top:100px;
 font-size:30px;
 text-decoration: none;
 }
 h1{
 color: white;
 }
</style>
</head>
<body>
<div class="container">
<% employee em=new employee();
request.setAttribute("id", em.getEmpid());
%>
<h1>Welcome Employee</h1>
  <div class="links">
    <a href="Emplink_assignProject">Assigned Projects</a></br>
    <a href="Myproject.jsp">My Projects</a></br>
    <a href="FeedbackTable.jsp">Reviews</a></br>
   <a href="viewAllContact.jsp">User Contact</a></br>
    
  </div>
  <img src="./images/ss.jpg" alt="super">
</div>

</body>
</html>