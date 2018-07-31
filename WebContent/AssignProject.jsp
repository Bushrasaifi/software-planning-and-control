<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.util.Base64"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="DAOimpl.daoImple"%>
<%@page import="DAO.DAOdemo"%>
<%@page import="Pojo.assign"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.modal-header, h4, .close {
      background-color: black;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
.img-responsive {
	height: 200px;
	width: 300px;
}
</style>
</head>
<body>
<h1>Projects</h1> 
<%

DAOdemo db=new daoImple();
if(db.getAllAssign()!=null){
	List<assign> result= db.getAllAssign();

	

%>

	<div class="container">  
	 
	<center> 
	   
  <table class="table table-striped">
    <tbody>
    <%
   
    for (assign a : result) {
    	request.setAttribute("immg", a.getImage());
		
System.out.println(a.getName()+"\t");
    %>
      <tr>
        <td><img src="getImage?aid=<%=a.getAid() %>" class="img-responsive" alt="img"></td>
        <td><%=a.getName() %></td>
        <td><a data-toggle="modal" href="#assign">Assign</a>&nbsp&nbsp</td>
        <td><a href="deleteAssign">Delete</a></td>
      </tr>
      <%
      }
    %>
    </tbody>
  </table></center>  

<div class="modal fade" id="assign" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="toggleModle">&times;</button>
          <h4><span class="glyphicon glyphicon-plus"></span> Assign project</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" method ="post" action="project_assignby_manager" >
            <div class="form-group">
              <label for="eid"><span class="glyphicon glyphicon-user"></span> Employee Id</label>
              <input type="text" class="form-control" id="eid" name="eid" placeholder="Enter employee id">
            </div>
             <div class="form-group">
              <label for=aid>assign id:</label>
              <input type="text" class="form-control" id="aid" name="aid">
            </div>
              <input type="submit" class="btn btn-default btn-block"><span class="glyphicon glyphicon-off"></span> Click</input>
          </form>
        </div>
      </div>
      
    </div>
    
    </div> 		
	</div>
	<%
	}
	%>
	 
</body>
</html>