<%@page import="sunbeam.beans.BooksBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Page</title>
</head>
<body>
     <h1>Welcome to Books Page!!!!</h1><hr>
     <jsp:useBean id="bb" class="sunbeam.beans.BooksBean"/>
     <jsp:setProperty name="bb" property="*"/>
     ${bb.fetchBooks()}
     
     <form method="post" action="ctl?page=addcart">
     <c:forEach var = "b" items="${bb.bookList}">
     <input type="checkbox" name="book" value="${b.book_id}"/>${b.book_name }<br/>
   
     </c:forEach>
     
     <input type="submit" value="AddCart"/><br></br>
     <a href='ctl?page=subjectsd'>Go to subject page</a>
     </form>
</body>
</html>