<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Review page</title>
<link rel="stylesheet" href="./css/reviewcss.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<object width="550" height="300">
								<embed src="./images/feedback.gif" width="100%" height="200">
								</embed>
								</object>
<div class="container">
  <form action="ReviewCon" method="post">
    <div class="row">
      <div class="col-25">
        <label for="name"> Name:</label>
      </div>
      <div class="col-75">
        <input type="text" id="name" name="name" placeholder="Your name..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="message">Message:</label>
      </div>
      <div class="col-75">
        <textarea id="message" name="message" placeholder="Write something.." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</body>
</html>