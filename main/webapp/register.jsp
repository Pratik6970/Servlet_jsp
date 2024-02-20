<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To Register Page!!!!!</title>
</head>
<body>
      <h1 align = "center">Welcome To Register Page!!</h1><hr>
       <h1 align ="center">Register</h1>
      <form method="post" action="ctl?page=login">
      <table border="1"align="center">
      <thead>
      <tr>
      <td>Id</td>
      <td><input type="text" name="Id"/></td>
      </tr>
      
       <tr>
      <td>Name</td>
      <td><input type="text" name="name"/></td>
      </tr>
      
       <tr>
      <td>Email</td>
      <td><input type="text" name="email"/></td>
      </tr>
      
       <tr>
      <td>Password</td>
      <td><input type="text" name="password"/></td>
      </tr>
      
       <tr>
      <td>Amount</td>
      <td><input type="text" name="reg_amt"/></td>
      </tr>
      
       <tr>
      <td>Role</td>
      <td><input type="text" name="role"/></td>
      </tr>
      
      <tr>
      
     <td><input type="submit" name="Register"/></td>
       
      </tr>
      </thead>
    
      </table>
      </form>
</body>
</html>