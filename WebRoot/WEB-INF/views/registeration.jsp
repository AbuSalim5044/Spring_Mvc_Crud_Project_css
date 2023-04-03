<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration_form</title>
<%@ include file="all_css.jsp"%>
</head>
<body style="background-color:#E6E6FA;">
	<h1 class="text-center">Welcome to new register page</h1>
	<%-- <%
String m=(String)request.getAttribute("msg");
String m2=(String)request.getAttribute("msg2");
%> --%>
	<!-- <form>
		<span style="margin-left: 2em;"> </span> <input type="button"
			value="Go back!" onclick="history.back()">
	</form> -->
	<%-- <h3><%=m %></h3>
<h3><%=m2 %></h3> --%>
<%-- 	<h3>${msg }</h3>
	<h3>${msg2 }</h3> --%>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<h3 class="text-center">${msg2 }</h3>
						<h3 class="text-center">${msg }</h3>
						<h3 class="text-center">Register Form</h3>
					</div>
					<div class="card-body">


						<form action="register.html" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Enter Name</label> <input
									type="text" class="form-control" name="name"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter Name">

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
									type="password" name="pass" class="form-control"
									id="exampleInputPassword1" placeholder="Password">
							</div>

							<div class="text-center">

								<button type="submit" class="btn btn-outline-success">Submit</button>
								<input type="submit" class="btn btn-outline-danger onclick="history.back()" value="Back"></>
								
							</div>
						</form>


					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- <form action="register.html" method="post">
		UserName :<input type="text" name="name" placeholder="Enter your name"><br>
		<br> Password :<input type="text" name="pass"
			placeholder="Enter your password"><br>
		<br> <span style="margin-left: 2em;"></span> <input type="submit"
			value="Submite">
	</form> -->
</body>
</html>