<%@page import="java.util.Iterator"%>
<%@page import="com.app.dao.AdminDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h1{
color: blue;
}

h2{
color:green;
}
p{
color:white;
}
label{
color:white;
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

div {
text-align: center;
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
<%
String Id = request.getParameter("search");
String sql="SELECT * FROM Tutor  WHERE  SUBJECT ="+Id;
List<String> lt = AdminDao.getTutor(sql);
Iterator<String> itr = lt.iterator();
%>
<center>
<h1>Tutors Details</h1>
<table>
<tr><th>ID</th>
<th>studentID</th>
<th>TutorID</th>
<th>Subject</th>
<th>question</th>
<th>Answer</th>
<th>Response</th>
</tr>

<%
while (itr.hasNext()){
	String ID=itr.next();
	String studentID=itr.next();
%>
<tr>
<td><%=ID %></td>
<td><%= %></td>
<td><%=itr.next() %></td>
<td><%=itr.next() %></td>
<td><%=itr.next() %></td>
<td><%=itr.next() %></td>
<td><a href="Tutor?tid=<%=ID%>">Response</a></td></tr>
<%} %>
</table> 
</center>
</body>
</html>