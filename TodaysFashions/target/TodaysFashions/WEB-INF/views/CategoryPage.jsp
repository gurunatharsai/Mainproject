<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@include file="header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<form:form action="addcategory" method="post" commandName="catobj">
<form:input path="catname" type="text" placeholder="Enter Category Name"/>

<form:input path="catdesc" type="text" placeholder="Enter Category desc"/>
<input type="submit" value="ADD"> 
</form:form>
<table style="width:100%">
  <tr>
    <th>CATEGORY NAME</th>
    <th>CATEGORY DESCRIPTION</th> 
    <th>EDIT</th>
      <th>DELETE</th>
    
  </tr>
   <c:forEach items="${categorylist }" var="cat">
  <tr>
    <td>${cat.catname}</td>
    <td>${cat.catdesc}</td>
    <td><a href="editCategory?catid=${cat.catid }">EDIT</a></td>
    <td><a href="deleteCategory?catid=${cat.catid }">DELETE</a></td>
  </tr>
  </c:forEach>
  </table>
<br>


</body>
</html>