<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>TodaysFashions</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .navbar-default {
    background-color: #00FFFF;
    border-color: #D5D5D5;
}
.navbar-default .navbar-nav > .dropdown > a .caret {
    border-top-color: #777;
    border-bottom-color: #777;
}
h1{
color: #4B0082;
text-align: center;
}
.img-responsive {
    margin: 0 auto;
    background-color: #00FFFF;
}
#grad1 {
    height: 200px;
    background: red; /* For browsers that do not support gradients */
    background: linear-gradient(to bottom right, rgba(255,0,0,0), rgba(255,0,0,1)); /* Standard syntax (must be last) */
}
.navbar-default .navbar-nav > .dropdown > a:hover .caret,
.navbar-default .navbar-nav > .dropdown > a:focus .caret {
    border-top-color: #333;
    border-bottom-color: #333;
}
  </style>
</head>
<body>
<h1><b> DEERBERG BOUTIQUE</b></h1>
<div class="container">
   
 <center> <p>TODAYSFASHIONS</p>  </center>            
</div>
<nav class="navbar navbar-default" style="font-weight: bold; background-color: #00FFFF;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index"></a>
    </div>
     <ul class="nav navbar-nav">
      <li ><a href="home"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      
     <li><a href="greatoffer">Great Offer</a></li>
        
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Dress Brands<span class="caret"></span></a>
      <ul class="dropdown-menu">
          <li><a href="Wrangler">Wrangler</a></li>
          <li><a href="Mori Lee">Mori Lee</a></li>
          <li><a href="Blush">Blush</a></li>
          <li><a href="La Femme">La Femme</a></li>
        </ul>
      </li>
      </ul>
    <form class="navbar-form navbar-left" action="">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
    
    <ul class="nav navbar-nav navbar-right">
		
					<li><a href="register"><span
							class="glyphicon glyphicon-user"></span>Register</a></li>
					
				
					<li><a href="addtocart" ><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
					<li><a href="userlist">Userlist</a></li>
					 <li><a href="updateuser">Editpage</a></li>
					<li><a href="mainpage">Sign out</a></li>
 					<li><a href="getCatPage">Add Category</a></li>
 					<li><a href="getSupPage">Add Supplier</a></li>

			
		</ul>
  </div>
</nav>


</body>
</html>
