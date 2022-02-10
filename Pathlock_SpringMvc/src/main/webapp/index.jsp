<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
</body>
<h1 style=text-align:center> REGISTRATION FORM </h1>
<center>
<form action="one" method="post">
<table>
<tr>
<td>
First Name  
 </td>
 <td>
<input type="text" placeholder="fname" name="fname"><br>
 </td>
 </tr>
 <tr>
 <td>
Last Name 
</td>
<td>   
<input type="text" placeholder="lname" name="lname"><br>
</td>
</tr>
<tr>
<td>
DOB    
</td>
<td>      
<input type="date" name="date"><br>
</td>
</tr>
<tr>
<td>
Email ID    
</td>
<td>
<input type="Email" placeholder="example@1" name="email">
 </td>
 </tr>
 <tr>
 <td>
Password  
</td>
<td>   
<input type="password" placeholder="password" name="pass">
</tr>
</tr>
<tr>
<td>
Mobile No    
</td>
<td>
<input type="tel" placeholder="9763******" name="mobile">
</td>
<tr>
<tr>
<td>
Gender       
</td>
<td>
             <input type="radio" name="gender" value="male">male
             <input type="radio" name="gender" value="female">female
             <input type="radio" name="gender" value="other">other
</td>
</tr>
<tr>
<td>
Hobbies 
</td>
<td>   
       <input type="checkbox" value="singing" name="hobbies">singing
       <input type="checkbox" value="dancing" name="hobbies">dancing
       <input type="checkbox" value="swimimg" name="hobbies">swiming
       <input type="checkbox" value="treaking" name="hobbies">treaking
</td>
</tr>
<tr>
<td>
Address  
</td>
<td>
<textarea row="4" col="15" placeholder="Address" name="address"></textarea>
 </td>
 </tr>            
 <tr>
 <td>
 Education qualification
 </td>
 <td>
     <select name="education">
     <option></option>
     <option>10+2</option>
     <option>diploma</option>
     <option>digree</option>
     
     </select> 
   </td>
   </tr>
   <tr>
   <td>
   <input type="submit" value="Register">
   <input type="Reset" value="Reset">
</table>

</form>
</center>
</body>

</html>