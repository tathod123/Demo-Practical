<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Add Cake Here!!!!!</h2>
<hr>

<form action="cakec" method="Get">
<!--  <input type="hidden" name="action" value="addcake">-->
<table>
<tr>
<td>Cake ID</td>
<td><input type="text" name="cakeid" placeholder="Enter Cake Id" required="required"></td>
</tr>
<tr>
<td>Cake Name</td>
<td><input type="text" name="cakename" placeholder="Enter Cake Name" required="required"></td>
</tr>
<tr>
<td>Cake Price</td>
<td><input type="text" name="cakeprice" placeholder="Enter Cake Price" required="required"></td>
</tr>
<tr>
<td>Cake Weight</td>
<td><input type="text" name="cakeweight" placeholder="Enter Cake Weight" required="required"></td>
</tr>
<tr>
<td>Cake Category</td>
<td>
<select name="cakecategory">
<option value="">Select Cake Category</option>
<option value="anniversary">Anniversary</option>
<option value="birthday">BirthDay</option>
<option value="engagment">Engagment</option>
</select>
</td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="add cake">
<input type="reset" value="clear">
</td>
</tr>

</table>
</form>
</center>


</body>
</html>