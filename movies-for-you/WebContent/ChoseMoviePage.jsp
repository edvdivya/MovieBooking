<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="fo" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chose Movie</title>
</head>
<body>
<jsp:include page="ShowMoviePage_2.jsp"></jsp:include>
<form action="ChooseMovieSubmit" method="POST">
		<table>
			<tr>
				<td>Movie Id:</td>
				<td><input name="movieId" /></td>
			</tr>
				<tr>
				<td><input type="submit" value="Submit Movie"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>