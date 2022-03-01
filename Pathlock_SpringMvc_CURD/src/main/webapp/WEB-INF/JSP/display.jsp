<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.cake.model.Cake" isELIgnored="false" %>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME IN JAVA</h1>
<h1>SCake CRUD</h1>
<h2><a href="add">Add Cake</a></h2>
<table border="2" >
<tr>
<th>CakeID</th>
<th>Cakename</th>
<th>Cakeprice</th>
<th>Cakeweight</th>
<td>Cakecategory</td>
<td>Action</td>
</tr>
<c:forEach  var="s1" items="${cakelist}">
<tr>
<td>${s1.getCakeid()}</td>
<td>${s1.getCakename()}</td>
<td>${s1.getCakeprice()}</td>
<td>${s1.getCakecategory()}</td>
<td><a href="edit?id=${s1.getCakeid()}">Edit</a>
<a href="delete?id=${s1.getCakeid()}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>