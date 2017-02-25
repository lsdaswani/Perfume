<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored ="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%-- <form:form method="post" modelAttribute="subcategory" action="addsubcategory" >
		
		<table>
                <tr>
                    <td><form:label path="subCategoryName">Name</form:label></td>
                    <td><form:input path="subCategoryName"/></td>
                </tr> 
                
                <tr>
                    <td><form:label path="subCategoryDescription">Description</form:label></td>
                    <td><form:input path="subCategoryDescription"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
	</form:form>
	
	<table>
                <c:forEach items="${subcategorylist}" var="s">
                    <tr>
                        <th>SUBCATEGORY ID</th>
                        <th>SUBCATEGORY NAME</th>
                        <th>SUBCATEGORY DESCRIPTION</th>
                        
                    </tr>
                    <tr>
                    	<td>${s.subCategoryId}</td>
                    	<td>${s.subCategoryName}</td>
                    	<td>${s.subCategoryDescription}</td>
            		</tr>
                    
                </c:forEach>

            </table> --%>
            
            
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div style="align:center">
								<h2>Add SubCategory</h2>
							</div>
						</div>
						<hr>
					</div>
  					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form:form modelAttribute="subcategory" action="addsubcategory" id="login-form" role="form" style="display: block;">
        						<div class="form-group">
       								<form:input path="subCategoryName"  placeholder="SubCategory Name" tabindex="1" class="form-control"/>
         						</div>
    							<br>
                  					<div class="form-group">
         								<form:input path="subCategoryDescription"  placeholder="SubCategory Description" tabindex="1" class="form-control"/>
        							</div>
    							<br>
       									<form:select path="category.categoryName" items="${categorylist}" itemValue="categoryName" itemLabel="categoryName" class="form-control"></form:select>
      							<br>
    										<div class="form-group">
												<div class="row">
													<div class="col-sm-6 col-sm-offset-3">
                    								<input type="submit" value="addsubcategory" tabindex="4" class="form-control btn btn-login"/>
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
	<table  class="table">  
		
    	<caption><h2>SubCategory List</h2></caption>
        <thead class="thead-default">
        <th>SubCategory Id</th>  
        <th>SubCategory Name</th>  
        <th>SubCategory description</th>  
        </thead>
        
        <tbody>
        	<c:forEach items="${subcategorylist}" var="s">
        	<tr>
            <td scope="row">${s.subCategoryId}</td>
			<td>${s.subCategoryName}</td>
			<td>${s.subCategoryDescription}</td>  
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