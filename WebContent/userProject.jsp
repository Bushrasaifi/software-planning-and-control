<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/font-awesome.min.css" rel="stylesheet">
<title>Projects</title>
<style>
.img-responsive{

height:300px;
width:400px;
}
</style>
</head>
<body>

<%
String image=request.getParameter("param1");
String name=request.getParameter("param2");
int id=Integer.parseInt(request.getParameter("param3"));
String tech=request.getParameter("param4");

%> 
<div class="row">
<div class="col-sm-6">
<img src=<%=image%> class="img-responsive"  alt="im">
</div>
<div class="col-sm-6">
<div class="container">
<h2>Project Name:<%=name %> </h2>
<h2>Technology:<%=tech %></h2>

  <a href="ProjectDownload?param=<%=id %>">Download Project?</a>
<a href="LearnWithUs.jsp?param1=<%=id %>">Learn with us?</a>
</div>

</div>
</div>


</body>
</html>