
<%@page import="sunbeam.beans.DetailBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show cart page</title>
</head>
<body>
   <h1>Show Book Page!!!!!</h1><hr>
   
   <jsp:useBean id="db" class="sunbeam.beans.DetailBean"/>
   <jsp:useBean id="cb" class="sunbeam.beans.CartBean" scope="session"/>
   <c:set var="total" value="0.0"/>
   <table border="1">
   <thead>
   <tr>
   <td>book_id</td>
    <td>subject_name</td>
     <td>book_name</td>
      <td>author_name</td>
       <td>price</td>
   </tr>
    <thead>
    
    <c:forEach var="id" items="${cb.cart}">
    <jsp:setProperty name="db" property="book_id" value="${id}"/>
    ${db.find()}
    <tr>
    <td>${db.book_id}</td>
    <td>${db.subject_name}</td>
    <td>${db.book_name}</td>
    <td>${db.author_name}</td>
    <td>${db.price}</td>
    </tr>
    <c:set var="total" value="${total+db.price}"/>
    </c:forEach>
   
   </table>
   
   <br/>
   <br></br>
   Total RS-${total}
   
   <a href='ctl?page=logout'><h1>Logout Page!!!</h1></a>
</body>
</html>