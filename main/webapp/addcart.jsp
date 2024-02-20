<%@page import="sunbeam.beans.CartBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addcart</title>
</head>
<body>
<h1>Add Cart Page!!!!!</h1><hr>
<jsp:useBean id="cb" class="sunbeam.beans.CartBean" scope="session"/>
<jsp:setProperty name="cb" property="book_id" param="book"/>
${cb.addCart()}

<h1>Books Add Successfully in cart!!!!</h1>
<a href="ctl?page=subjectsd"><h1>Go to subject cart page!!!!!</h1></a>
<a href="ctl?page=showcart"><h1>Go to show cart page!!!!!</h1></a>

</body>
</html>