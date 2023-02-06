<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.*"%>
<%@page import="java.lang.*"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h2>called by controller</h2>
	<h1>url /home</h1>
	<h1>now time is ${Time}</h1>
	<%-- <% 
String name = (String)request.getAttribute("name");

List<String> mo =(List<String>) request.getAttribute("movies");

%> --%>

	<h1>name is ${name}</h1>

	<%-- <% for(String s:mo){
	%>
	<h1><%=s %></h1>
	<%
	}
	%>  --%>

	<!-- this will list like[a,b,c,d] -->
	<h1>${movies }</h1>
	<!-- to traverse one by one is  -->
	<c:forEach var="item" items="${movies}">
		<h1>
			<c:out value="${item}"></c:out>
		</h1>
	</c:forEach>

</body>

</html>