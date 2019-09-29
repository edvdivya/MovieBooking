<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="addBooking" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add product
<table>
<addBooking:form action="pagesubmit" method="post" modelAttribute="booking_details">
<tr>
<td>Seats: </td>
<td><addBooking:input path="productName"/></td>
<td><span><addBooking:errors path="productName"></addBooking:errors></span></td>
</tr>
<tr>
<td>Product Price: </td>
<td><addBooking:input path="productPrice"/></td>
<td><span><addBooking:errors path="productPrice"></addBooking:errors></span></td>
</tr>
<tr>
<td>Product Type: </td>
<td><addBooking:select path="productType" items="${dataitem}"/></td>
<td><span><addBooking:errors path="productType"></addBooking:errors></span></td>
</tr>
<tr>
<td>Online</td>
<td><addBooking:radiobuttons path="online" items="${radiodataitem}"/></td>
</tr>
<tr>
<td>Features</td>
<td><addBooking:checkboxes path="features" items="${featuresdataitem}"/></td>
</tr>
<tr>
<td><input type="submit" value="Add Product"></td>
</tr>
</addBooking:form>
</table>
</body>
</html>