<%@page import="DAOimpl.daoImple"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOdemo"%>
<%@page import="Pojo.projects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">  

  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>TECHNOLOGY</th>
        <th>NAME</th>
        <th>IMAGE</th>
        <th>PROJECT FILE</th>
        
      </tr>
    </thead>
    <%  
       projects em=new projects(); 
       DAOdemo db=new daoImple(); 
       List<projects> result=db.getProjectsDetails(em);
       Iterator<projects> it=result.iterator();
		while(it.hasNext())
		{
			projects e=(projects)it.next();
		
    
    %>       
    
    <tbody>
      <tr>
        <td><%=e.getPid() %></td>
        <td><%=e.getPtech() %></td>
        <td><%=e.getPname() %></td>
        <td><%=e.getPimages() %></td>
        <td><%=e.getPfiles() %></td>
        
      </tr>
      
    </tbody>
    <% }%>
  </table>
</div>





</body>
</html>