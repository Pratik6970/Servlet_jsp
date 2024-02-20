<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="sunbeam.beans.SubjectBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>subjects</title>
</head>
<body>
<h1>Welcome To Subject Page!!!!!</h1><hr>

<jsp:useBean id="sb" class="sunbeam.beans.SubjectBean"/>
  ${sb.fetchSubjects()}

<form method="post" action ="ctl?page=books">

<%-- 
<%for(String sub:sb.getSubjectList()) {%>
<input type="radio" name="subject_name" value="<%=sub%>"/><%= sub %><br/>
<%} %>
 --%>


<c:forEach var="sub" items="${sb.subjectList}">
<input type="radio" name="subject_name" value="${sub}"/>${sub}<br/>
</c:forEach>
<input type="submit" value="show books"/><br></br>

<a href="ctl?page=showcart"><h1>Show Cart</h1></a>
</form>
</body>
</html>









