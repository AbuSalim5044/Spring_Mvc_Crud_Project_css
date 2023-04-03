 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to search page</h1>
	<form action="searchById.html" method="Get">
		<input type="text" name="search" placeholder="Enter your Id">
		<button type="submit">Submit</button>
	</form>	  <h3><a href="add.html">Home</a>
<span style="margin-left: 15em;"> </span></h3>
	
	
				<table  align="left" border="1">
					<thead class="thead-dark">
                        <tr>
						<th scope="col">Employee ID</th>
						<th scope="col">Employee Name</th>
						<th scope="col">Employee Age</th>
						<th scope="col">Employee Salary</th>
						<th scope="col">Employee Address</th>
						</tr>
					</thead>
					<tbody>
                         <tr>
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.age}</td>
						<td>${employee.salary}</td>
						<td>${employee.address}</td>
						</tr>
					</tbody>
				</table>
				
</body>
</html>