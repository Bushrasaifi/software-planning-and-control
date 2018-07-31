<%@page import="java.util.Iterator"%>
<%@page import=" DAO.DAOdemo"%>
<%@page import="DAOimpl.daoImple "%>
<%@page import="Pojo.employee "%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
<title>All Employees</title>
</head>
<body>

<div class="container">  

  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>PASSWORD</th>
        <th>ADDRESS</th>
        <th>AGE</th>
        <th>QUALIFICATION</th>
      </tr>
    </thead>
    <%  
       employee em=new employee(); 
       DAOdemo db=new daoImple(); 
       List<employee> result=db.getAll(em);
       Iterator it=result.iterator();
		while(it.hasNext())
		{
			employee e=(employee)it.next();
		
    
    %>       
    
    <tbody>
      <tr>
        <td><%=e.getEmpid() %></td>
        <td><%=e.getEname() %></td>
        <td><%=e.getEemail() %></td>
        <td><%=e.getEpassword() %></td>
        <td><%=e.getEaddress() %></td>
        <td><%=e.getEage() %></td>
        <td><%=e.getEQualification() %></td>
      </tr>
      
    </tbody>
    <% }%>
  </table>
</div>



</body>
</html>