<%@page import = "sunbeam.beans.UserBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auth</title>
</head>
 <jsp:useBean id="user" class="sunbeam.beans.UserBean" scope="session"/>
  <jsp:setProperty name="user" property="*"/>
  
  
<body>
  
  
  
 
   
 <h5>Navigation outcome: ${sessionScope.user.authenticateUser() }</h5>
 <a href='ctl?page=subjectsd'><h1>Go to subject page!!!</h1></a>
      
</body>
</html>