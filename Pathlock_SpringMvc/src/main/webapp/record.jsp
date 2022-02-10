<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@page import="com.pathlock.model.Student,java.util.ArrayList" isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("u1") %>
<%=request.getAttribute("u2") %>
<%=request.getAttribute("u3") %>
<%=request.getAttribute("u4") %>
<%=request.getAttribute("u5") %>
<%=request.getAttribute("u6") %>
<%=request.getAttribute("u7") %>
<%=request.getAttribute("u8") %>
<%=request.getAttribute("u9") %>
 <h1>Student Record</h1>
 ${xyz}
 
<table border="2">
<tr>
<th>fname</th>
<th>lname</th>
<th>DOB</th>
<th>Email</th>
<th>Password</th>
<th>mobile</th>
<th>Hobbies</th>
<th>Address</th>
<th>Education</th>
<th>Action</th>

</tr>

<c:forEach var="s1" items="${studentRecord}">
<tr>
<td>${s1.getFname()}</td>
<td>${s1.getLname()}</td>
<td>${s1.getDate()}</td>
<td>${s1.getEmail()}</td>
<td>${s1.getPassword()}</td>
<td>${s1.getMobile()}</td>
<td>${s1.getHobbies()}</td>
<td>${s1.getAddress()}</td>
<td>${s1.getEducation()}</td>
<td><a href="Edit?fname=${s1.getFname()}">Edit</a> &nbsp;&nbsp;<a href="Delete">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>