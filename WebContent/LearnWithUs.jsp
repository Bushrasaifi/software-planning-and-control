<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learn with us</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("param1"));

%>>
<center>
<h1>Lets Start!</h1>
<p>most welcome. we are here to guide you about the  project you are selected. </p>
<p>hope you will get proper planning of your project from this site.</p>
<p>our way to make you plan the software projects is daily basis</p>
<p>we can give you the day by day task for the complition</p>
<a href="DayStart?param=<%=id %>" class="btn btn-info" role="button">GO</a>

</center>




</body>
</html>