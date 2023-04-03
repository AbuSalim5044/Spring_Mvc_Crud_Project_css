<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_css.jsp"%>
</head>
<body style="background-color: #E6E6FA;">
	<h1 class="text-center">Welcome to login page</h1>
	<%-- <%
String m=(String)request.getAttribute("msg3");
%>
<h3><%=m %></h3> --%>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<h3 >${msg3 }</h3>
						<h3 class="text-center">Login Form</h3>
					</div>
					<div class="card-body">


						<form action="loginpost.html" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Enter Name</label> <input
									type="text" class="form-control" name="name" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Name">
								
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
									type="password"  name="pass" class="form-control" id="exampleInputPassword1"
									placeholder="Password">
							</div>
							
							<div class="text-center">
							
							<button type="submit" class="btn btn-outline-success">Login</button>
							<a href="registeration.html"  class="btn btn-outline-primary">NewRegister</a>
							</div>
						</form>

						
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>