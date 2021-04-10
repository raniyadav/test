<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >
h1{
color: blue;
}

h2{
color:green;
}
td{
color:white;
}
a{
color: white;
}
.bg{
background-image: url("15.jpg");
background-repeat: no-repeat;
background-position: center;
background-size: cover;
background-size: 1500px 1600px;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg">
<center>
<h1><b>Login</b></h1>
<table>
<form action="Register" method="post">
<tr><td><b>Email</b></td><td><input type="text" name="uid"></td></tr>
<tr><td><b>Password</b></td><td><input type="password" name="pwd"></td></tr>
<tr><td><input type="submit" class="btn btn-info" value="Login"></td></tr>
</table>
</center>
</body>
</html>