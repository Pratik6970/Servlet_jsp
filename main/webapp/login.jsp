<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
.container {
  text-align: center; /* Center aligns the anchor element */
}
</style>

</head>
<body>
      <h1 align ="center">Welcome To BookShop</h1></hr>
     
      <form method = "post" action ="ctl?page=authsd">
      <table align="center" border="solid">
      <tr>
      <td>Enter the Email</td>
      <td>
      <input type="text" name="email"/><br/>
      </td>
      </tr>
      
      <tr>
      <td>Enter the Password</td>
        <td>
      <input type="text" name="password"/><br/>
        </td>
      </tr>
      
       <tr>
     <td><input type="submit" value="Submit"/></td></br>
  
      </tr>
        
      </table>
       <div class="container">
         <a href='ctl?page=register'>Sign Up</a>
       </div>
      </form>
</body>
</html>