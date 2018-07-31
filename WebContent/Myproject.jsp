<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="DAOimpl.daoImple"%>
<%@page import="DAO.DAOdemo"%>
<%@page import="Pojo.projects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Myproject</title>
</head>
<body>
<div class="container">  

  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>IMAGE</th>
        <th>TECHNOLOGY</th>
      </tr>
    </thead>
    <%  
       projects em=new projects(); 
       DAOdemo db=new daoImple(); 
       List<projects> result=db.getProjectsDetails(em);
       Iterator it=result.iterator();
		while(it.hasNext())
		{
			projects e=(projects)it.next();
		
    
    %>       
    
    <tbody>
      <tr>
        <td><%=e.getPid() %></td>
        <td><%=e.getPname() %></td>
        <td><%=e.getPimages()%></td>
        <td><%=e.getPtech() %></td>
       
      </tr>
      
    </tbody>
    <% }%>
  </table>
  <
</div>
<a href="emp-project-upload.jsp " class="btn btn-info" role="button">Upload New?</a>



</body>
</html>