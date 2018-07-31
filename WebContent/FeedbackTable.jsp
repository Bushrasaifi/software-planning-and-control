<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import=" DAO.DAOdemo"%>
<%@page import="DAOimpl.daoImple "%>
<%@page import="Pojo.review "%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>feedback table</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">  
<center><h1>Feedbacks</h1></center>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Review Id</th>
        <th>NAME</th>
        <th>Message</th>
        
      </tr>
    </thead>
    <%  
       review re=new review(); 
       DAOdemo db=new daoImple(); 
       List<review> result=db.getAllReview(re);
       Iterator it=result.iterator();
		for(review e:result)
		{
    
    %>       
    
    <tbody>
      <tr>
        <td><%=e.getRid() %></td>
        <td><%=e.getRname() %></td>
        <td><%=e.getMsg()%></td>
        
      </tr>
      
    </tbody>
    <% }%>
  </table>
</div>









</body>
</html>