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

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div style="align: center">
								<h2>Add Category</h2>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form:form method="POST" modelAttribute="category"
									action="addcategory" id="login-form" role="form"
									style="display: block;">
									
									<div class="form-group">
										<form:input path="CategoryName" placeholder="Category Name"
											tabindex="1" class="form-control" />
									</div>
									<br>
									<div class="form-group">
										<form:input path="CategoryDescription"
											placeholder="Category Description" tabindex="2"
											class="form-control" />
									</div>
									<br>
									<div class="form-group">
										<form:input path="categoryId" class="form-control" id="edit" type="hidden"/>
									</div>
									<br>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" value="addcategory" tabindex="4"
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
				<h2>Category List</h2>
			</caption>

			<thead class="thead-default">

				<th>Category Id</th>
				<th>Category Name</th>
				<th>Category Description</th>
				<th>Edit</th>
				<th>Delete</th>

			</thead>

			<tbody>
			
				<c:forEach items="${categorylist}" var="l">
				<tr>
					<td scope="row">${l.categoryId}</td>
					<td>${l.categoryName}</td>
					<td>${l.categoryDescription}</td>
					<td><a href="updateCategory-${l.categoryId}" class="btn btn-warning">Edit</a></td>
					<td><a href="/deleteCategory/${l.categoryId}" class="btn btn-danger">Delete</a></td>
				</tr>
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