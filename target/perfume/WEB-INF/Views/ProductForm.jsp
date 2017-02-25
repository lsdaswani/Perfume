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
                    
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div style="align:center">
								<h2>Add Product</h2>
							</div>
						</div>
						<hr>
					</div>
  					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form:form modelAttribute="product" action="addproduct" id="login-form" role="form" style="display: block;">
        						<div class="form-group">
       								<form:input path="productName"  placeholder="Product Name" tabindex="1" class="form-control"/>
         						</div>
    							<br>
                  					<div class="form-group">
         								<form:input path="productDescription"  placeholder="Product Description" tabindex="1" class="form-control"/>
        							</div>
    							<br>
    								<%-- <br>
                  					<div class="form-group">
         								<form:input path="productPrice"  placeholder="Product Price" tabindex="1" class="form-control"/>
        							</div>
    							    <br> --%>
    							    <%-- <br>
                  					<div class="form-group">
         								<form:input path="productQuantity"  placeholder="Product Quantity" tabindex="1" class="form-control"/>
        							</div>
    								<br> --%>
    								<br>
                  					<%-- <div class="form-group">
         								<form:input path="productManufactured"  placeholder="Product ManuFactured" tabindex="1" class="form-control"/>
        							</div> --%>
        							<br>
        								<form:select path="category.categoryName" items="${categorylist}" itemValue="categoryName" itemLabel="categoryName" class="form-control"  ></form:select>
    								<br>
    									<form:select path="subCategory.subCategoryName" items="${subcategorylist}" itemValue="subCategoryName" itemLabel="subCategoryName" class="form-control" ></form:select>
    								<br>
       									<form:select path="supplier.supplierName" items="${supplierlist}" itemValue="supplierName" itemLabel="supplierName" class="form-control"></form:select>
      								<br>
    										<div class="form-group">
												<div class="row">
													<div class="col-sm-6 col-sm-offset-3">
                    								<input type="submit" value="addproduct" tabindex="4" class="form-control btn btn-login"/>
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
		
    	<caption><h2>Product List</h2></caption>
        <thead class="thead-default">
        	<th>PRODUCT NAME</th>
            <th>PRODUCT DESCRIPTION</th>
           <!--  <th>PRODUCT PRICE</th> -->
           <!--  <th>PRODUCT QUANTITY</th>
           	<th>PRODUCT MANUFACTURED</th> -->  
        </thead>
        
        <tbody>
        	<c:forEach items="${productlist}" var="pl">
        	<tr>
            <td scope="row">${pl.productId}</td>
            	<td>${pl.productName}</td>
                <td>${pl.productDescription}</td>
               <%--  <td>${pl.productPrice}</td> --%>
               <%--  <td>${pl.productQuantity}</td> --%>
               <%--  <td>${pl.productManufactured}</td> --%>
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