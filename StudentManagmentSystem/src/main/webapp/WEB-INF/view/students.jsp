<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Students Management System</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="background-color:lightBlue;">
<div class="container">
		<div class="row">
			<h1 style="background-color:Blue;">List Students</h1>
		</div>
		<table class="table table-striped table-bordered">
			<thead class="table-dark">
				<tr>
					<th style="color:pink;">Students First Name</th>
					<th style="color:pink;">Students Last Name</th>
					<th style="color:pink;">Students Email</th>
					<th style="color:pink;">Students Mobile</th>
					<th>Actions</th>
				</tr>
			</thead>
			
			<body>
				<tr th:each="student:${students}">
					<td th:text="${student.firstName}">
					<td th:text="${student.lastName}">
					<td th:text="${student.email}">
					<td th:text="${student.mobile}">
				</tr>
			</body>
		</table>
	</div>

</body>
</html>