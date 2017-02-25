<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href="Resources/css/styles.css" rel="stylesheet">
  <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <script src="Resources/js/jquery-1.10.2.min.js"></script>
  <script src="Resources/js/jquery.sldr.js"></script>
  
   <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>

  
</head>
<body>
<!-- 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PeRlOgNe</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Perfumes <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Men</a></li>
          <li><a href="#">Women</a></li>
          <li><a href="#"></a></li>
        </ul>
      </li>
      <li><a href="#">About</a></li>
      <a href="/category">categorytestlink</a>
<a href="/addsubcategory">subcategorytestlink</a>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
 -->

<div class="container">

	<div id="myCarousel" class="Carousel slide" data-ride="carousel">
	<ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    
  </ol>	
		
	<div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="Resources/Images/1.jpg" alt="1" width="460" height="345">
      </div>

      <div class="item">
        <img src="Resources/Images/2.jpg" alt="2" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="Resources/Images/3.jpg" alt="3" width="460" height="345">
      </div>

    </div>
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
		<a onclick="document.getElementById('id01').style.display='block'">nextpage</a>
</div>
</div>

</body>
</html>