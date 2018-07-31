<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
 <script type= "text/javascript" src="js/bootstrap.min.js"></script>
 <script src="js/jquery.min.js"></script>
 <script src="js/jquery-ui.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Manager page</title>
<link rel="stylesheet" href="css/manEmp.css">


<style>
.glyphicon{
width:400Spx;
height:30px;

}

.modal-header, h4, .close {
      background-color: navy;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="jumbotron">
			<div class="row">
				<div class="col-sm-6">
					<center>
						<h2>pLAN4SOFTWARE</h2>
						<h5>welcome manager</h5>
					</center>
				</div>
				<div class="col-sm-6">
					<img src="./images/img_avatar.png" alt="pic" style="width:200px; height:200px; border-radius:50%">
				</div>
			</div>
		</div>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">Home</a></li>
			<li><a data-toggle="tab" href="#employee">Manage Employee</a></li>
			<li><a data-toggle="tab" href="#users">Manage Users</a></li>
			<li><a  href="index.jsp">Logout</a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
			<div class="row">
			<div class="col-sm-6">
				<img src="./images/bacck.jpg" alt="pic" style="width:500px; height:300px ;border-radius:50%;">
				</div>
				<div class="col-sm-6">                                                                                                                                                                                                                                                                   
				      
				      <h2><a href="profile.html">Your Profile</a></h2><br>
				     <h2> <a href="AssignProject.jsp">Assign Projects</a></h2><br>
				      <h2><a href="viewAllProject.jsp">View  All Projects</a></h2><br>
				      <h2><a href="FeedbackTable.jsp">See feedbacks</a></h2>
				      
				</div>
				</div>
			</div>
			
			<div id="employee" class="tab-pane fade">
				<div class="links">
   <span class="glyphicon glyphicon-plus-sign" style="color:black;font-size:50px"></span> <a href="employeeRegister.jsp">Add New</a></br>
   <span class="glyphicon glyphicon-remove-sign" style="color:black;font-size:50px"></span> <a data-toggle="modal"href="#myModal">Delete</a></br>
    <span class="glyphicon glyphicon-wrench" style="color:black;font-size:50px"></span> <a href="updateEmp.jsp">Update</a></br>
    <span class="glyphicon glyphicon-eye-open" style="color:black;font-size:50px"></span><a href=viewAllEmp.jsp>View All</a>
    
    
  </div>
			</div>
			
			<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-remove"></span> Delete</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" method ="post" action="DeleteCon">
            <div class="form-group">
              <label for="eid"><span class="glyphicon glyphicon-user"></span> Employee Id</label>
              <input type="text" class="form-control" id="eid" name="eid" placeholder="Enter employee id">
            </div>
            
            
            
              <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-off"></span> Click</button>
          </form>
        </div>
      </div>
      
    </div>
    
    </div> 		
  	<%
  		String del=(String)request.getAttribute("delete");
            		  if(del!=null)            		  
           		  if(del.equals("del")){
            			  %> 
            			  	<div class="modal fade" id="myModal" role="dialog"> 
    <div class="modal-dialog"> 
     <div class="modal-content"> 
         <div class="modal-header" style="padding:35px 50px;"> 
          <button type="button" class="close" data-dismiss="modal">&times;</button> 
           <h4><span class="glyphicon glyphicon-remove"></span> Successfully Deleted!</h4> 
         </div> 
        
       </div> 
      
     </div> 
    
     </div> 
            		}
  	
  	
              	else 
             		  { 
            			  %>
            			  	<div class="modal fade" id="myModal" role="dialog"> 
    <div class="modal-dialog"> 
      <div class="modal-content"> 
         <div class="modal-header" style="padding:35px 50px;"> 
          <button type="button" class="close" data-dismiss="modal">&times;</button> 
         <h4><span class="glyphicon glyphicon-remove"></span>Failed! no id found!</h4>
       </div> 
        
      </div> 
      
    </div>
    
     </div>
            			  <%
             		  } 
  	 
  	           %>
			<div id="users" class="tab-pane fade">
				<h3>Menu 2</h3>
			</div>
			
		</div>
	</div>





</body>
</html>