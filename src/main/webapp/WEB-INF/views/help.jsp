<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<% 
String name =(String) request.getAttribute("name"); 
Integer rollNumber = (Integer) request.getAttribute("RollNumber");
LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%> 
<h1>This is Help Page</h1>
<h2>Hello My Name Is <%= name %> </h2>
<h2>Hello My RollNumber is <%= rollNumber %></h2>
<h2>time is <%= time %></h2>

</body>
</html>