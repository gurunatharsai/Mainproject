<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@include file="header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Supplier</title>
</head>
<body>
<form:form action="addsupplier" method="post" commandName="supobj">
<form:input path="supname" type="text" placeholder="Enter Supplier Name"/>

<form:input path="supaddress" type="text" placeholder="Enter Supplier address"/>


<input type="submit" value="ADD"> 
</form:form>
<table style="width:100%">
  <tr>
    <th>SUPPLIER NAME</th>
    <th>SUPPLIER ADDRESS</th> 
    <th>SUPPLIER ID</th>
   
    
  </tr>
    
   <c:forEach items="${supplierlist }" var="sup">
  <tr>
    <td>${sup.supname}</td>
    <td>${sup.supdesc}</td>
  
  </tr>
  </c:forEach>
  </table>
<br>


</body>
</html>