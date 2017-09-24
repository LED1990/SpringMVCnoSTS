<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Adding new user with car form!</h1>

	<h2>Type needed info</h2>
	<form:form action="/SpringMVCnoSTS/addNew" method="POST">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="id">ID</form:label></td>
				<td><form:input path="id"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="carModel.mark">Mark</form:label></td>
				<td><form:input path="carModel.mark"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="carModel.model">Model</form:label></td>
				<td><form:input path="carModel.model"></form:input></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>