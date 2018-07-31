<%@page import="DAOimpl.daoImple"%>
<%@page import="DAO.DAOdemo"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.Blob"%>
<%@page import="Pojo.projects"%>
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
<link rel="stylesheet" href="./css/userWelcome.css">

<title>user welcome</title>
<style>
.img-responsive {
	height: 200px;
	width: 400px;
}

button {
	float: left;
	width: 20%;
	padding: 10px;
	background: black;
	color: white;
	font-size: 17px;
	border: 1px solid grey;
	border-left: none;
	cursor: pointer;
}

input[type=text] {
	padding: 10px;
	font-size: 16px;
	border: 1px solid grey;
	float: left;
	width: 80%;
	background: white;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Projects</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="feedback.jsp">feedback</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><input type="text" id="myInput" onkeyup="myFunction()"
					placeholder="Search for project.." title="Type in a name">
				<button type="submit">
						<i class="fa fa-search"></i>
					</button></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="jumbotron">
		<div class="container text-center">
			<h1>pLAN4SOFTWARE</h1>
			<p>Project planner and controller.</p>
		</div>
	</div>
	<h3>Find your Project!!</h3>
	<%
		projects pr = new projects();
		DAOdemo dd = new daoImple();
		List<projects> lists = dd.getProjectsDetails(pr);

		
	%>

	<div class="container-fluid bg-3 text-center">
		<table class="table table-striped">
			<tbody>
			<%
			
			for (projects a : lists) {
		    	request.setAttribute("immg", a.getPimages());
				
			%>
				<tr>

					<td><h3><%=a.getPname()%></h3>
					</td>
					<td><a href="userProject.jsp?param1=getimageFromProjects?pid=<%=a.getPid()%>&param2=<%=a.getPname()%>&param3=<%=a.getPid()%>&param4=<%=a.getPtech() %>">	<img src="getimageFromProjects?pid=<%=a.getPid()%>"
							class="img-responsive" style="width: 100%" alt="Image">
					</a></td>
					</tr>
					<%
						}
					%>
					</tbody></table></div>
					


					<div id="templatemo_contact" class="container_wapper">
						<div class="container-fluid">
							<h1>Contact</h1>
							<div class="col-xs-12">
								<div id="templatemo_contact_map"></div>
							</div>
							<div class="col-md-4">
								<h2>Contact Info.</h2>
								<p>if you have any query about our planning and controlling
									process and the way we are providing the software content to
									you .you are free to contact with us.</p>
								<br>
								<p>
									<strong>Email:</strong> info@pLAN4SOFTWARE.com<br />
									<strong>Phone:</strong> 999999999<br />
									<strong>Website:</strong> www.pLAN4SOFTWARE.com<br />
								<ul class="list-inline social-link">
									<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-youtube"></i></a></li>
									<li><a href="#"><i class="fa fa-github"></i></a></li>
								</ul>
							</div>
							<form action="ContactCon" method="post" class="col-md-8">
								<div class="row">
									<div class="col-md-12">
										<h2>Send Enquiry</h2>
									</div>
									<div class="col-md-6">
										<p>Name</p>
										<input type="text" name="name" id="name"
											placeholder="Your Name" />
									</div>
									<div class="col-md-6">
										<p>Email</p>
										<input type="text" name="email" id="email"
											placeholder="Your Email" />
									</div>
									<div class="col-md-12">
										<p>Subject</p>
										<input type="text" name="subject" id="subject"
											placeholder="Subject" />
									</div>
									<div class="col-md-12">
										<p>Message</p>
										<textarea name="message" id="message"
											placeholder="Write your message here..."></textarea>
									</div>
									<div class="col-xs-6 col-sm-3 col-md-offset-6">
										<button type="submit">Send</button>
									</div>
									<div class="col-xs-6 col-sm-3">
										<button type="reset">Reset</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<div id="templatemo_footer">
						<div>
							<p id="footer">Copyright &copy;2018 pLAN4SOFTWARE</p>
						</div>
					</div>
</body>
</html>