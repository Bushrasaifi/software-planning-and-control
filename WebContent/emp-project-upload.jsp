<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>Upload project</title>
</head>
<body>
<center>
<h1>Upload project.</h1>
<form action="UploadProject" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="name">Project name</label>
    <input type="text" class="form-control" id="name" name="name">
  </div>
  <div class="form-group">
    <label for="tech">Technology:</label>
    <input type="text" class="form-control" id="tech" name="tech">
  </div>
  <div class="form-group">
    <label for="files">Project:</label>
    <input type="file" class="form-control" id="files" name="files">
  </div>
  <div class="form-group">
    <label for="image">image:</label>
    <input type="file" class="form-control" id="files" name="files">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</center>

</body>
</html>