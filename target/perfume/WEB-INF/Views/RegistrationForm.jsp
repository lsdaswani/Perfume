<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="mfw.css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Tangerine"
	rel="stylesheet" type="text/css" />

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div style="align: center">
								<h2>Add User</h2>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form:form method="POST" modelAttribute="userReg"
									action="adduserreg" id="login-form" role="form"
									style="display: block;">

									<div class="form-group">
										<form:input path="username" placeholder="User Name"
											tabindex="1" class="form-control" />
									</div>
									<br>
									<div class="form-group">
										<form:input path="password"
											placeholder="**********" tabindex="2"
											class="form-control" />
									</div>
									<br>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" value="addUser" tabindex="4"
													class="form-control btn btn-login" />
											</div>
										</div>
									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<div class="table-responsive">
		<table class="table">

			<caption>
				<h2>User List</h2>
			</caption>

			<thead class="thead-default">

				<th>User Id</th>
				<th>User Name</th>
				<th>Password</th>

			</thead>

			<tbody>
				<c:forEach items="${userreglist}" var="u">
					<td scope="row">${l.userId}</td>
					<td>${u.username}</td>
					<td>${l.password}</td>
				</c:forEach>
			</tbody>
		</table>
	</div>
			
			
			
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/4af3405488.js"></script>

</body>
</html>