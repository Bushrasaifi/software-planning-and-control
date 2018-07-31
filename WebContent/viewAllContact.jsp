<%@page import="java.util.Iterator"%>
<%@page import="DAOimpl.daoImple"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOdemo"%>
<%@page import="Pojo.contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
  <script src="js/jquery.min.js"></script>
 <script src="js/jquery-ui.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">  

  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>SUBJECT</th>
        <th>MESSAGE</th>
        <th>Give Replies</th>
        
      </tr>
    </thead>
    <%  
       contact em=new contact(); 
       DAOdemo db=new daoImple(); 
       List<contact> result=db.getAllContact(em);
       Iterator it=result.iterator();
		while(it.hasNext())
		{
			contact c=(contact)it.next();
		
    
    %>       
    
    <tbody>
      <tr>
        <td><%=c.getUid()%></td>
        <td><%=c.getUname()%></td>
        <td><%=c.getUemail()%></td>
        <td><%=c.getSubject()%></td>
        <td><%=c.getMessage()%></td>
        <td><a data-toggle="modal" href="#myModal">Reply</a></td>
      </tr>
      
    </tbody>
    
  </table>

<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-envelope"></span> COMPOSE</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" method ="post" action="mailto:"<%=c.getUemail()%>>
            <div class="form-group">
              <label for="to"> TO</label>
              <input type="text" class="form-control" id="to" name="to" >
            </div>
            <div class="form-group">
              <label for="subject">Subject</label>
              <input type="text" class="form-control" id="subject" name="subject" >
            </div>
            <div class="form-group">
  <label for="msg">Message:</label>
  <textarea class="form-control" rows="5" id="msg" name="msg"></textarea>
</div>
            
            
            
              <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-off"></span> Send</button>
          </form>
        </div>
      </div>
      
    </div>
    
    </div> 		

<% }%></div>

</body>
</html>