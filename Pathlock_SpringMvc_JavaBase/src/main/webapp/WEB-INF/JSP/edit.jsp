<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.think.model.Student,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>s
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM method="GET" action="save" >
<table>
<tr>
<th>Name:</th>
<td> <input type="text" name="sname" Value="${std.getSid()}" readonly />
</tr>
<tr>
<th>Percent</th>
<td><input type="text" name="percent" Value="${std.getSname()}"></td>
</tr>
<tr>
<th>City</th>
<td><input type="text" name="city" Value="${std.getPercent()}"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="submit"  Value="${std.getCity()}">
</td>
</tr>
</table>
</body>
</html>