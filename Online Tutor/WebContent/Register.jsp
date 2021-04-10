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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body class="bg">  
<center>
<h1><b>Register</b></h1>
<form action="Register" method=post><table>
<tr><td><b>Name</b></td><td><input type="text" name="name"></td></tr>
<tr><td><b>Email</b></td><td><input type="text" name="uid"></td></tr>
<tr><td><b>Password</b></td><td><input type="password" name="pwd"></td></tr>
<tr><td><b>Mobile</b></td><td><input type="text" name="mbl"></td></tr>
<tr><td><b>Experience</b></td><td><input type="text" name="exp"></td></tr>
<tr><td><b>Subject</b></td><td><select name="sub" id="subject">
  <option value="">-Select-</option>
  <option value="Maths">Maths</option><p>MathsTutor </p>
  <option value="CloudComputing">CloudComputing</option>
  <option value="InformationTechnology">informationTechnology</option>
  <option value="Java">Java</option>
</select></td></tr>
<tr><td><b>Location</b></td><td><input type="text" name="lct"></td></tr>
<tr><td><input type="submit" class="btn btn-info" value="Register"></td></tr> 
</table>
</form>
</center>
</body>
</html>