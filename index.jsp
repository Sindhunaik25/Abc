<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<style>
.headpart {
	font-family: 'Courier New', Courier, monospace;
    font-size: 20px;
    background-color: aqua;
    text-align: center; 
    color:maroon;
    margin-top: -0.5%;
    margin-left: -0.6%;
    margin-right: -0.6%;
}

.mySlides {
	display: none;
	margin: 2%;
	margin-left: 13%;
}

.w3-content w3-section {
	max-width: 500px;
	max-width: height 300px;
}

div.desc {
  margin: 0%;
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
  color: wheat;
  font-size: 10px;
}

body{
    background-image:url(colo.jpeg) ;
}

.home{
  margin-top:-2.2%;

}
.home td:hover{
  border: 5px solid rgb(60, 190, 199);
  background-color:brown;
}

.topnav {
  overflow: hidden;
  background-color: #333;
  margin:-1.9%;
}
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 15px 16px;
  text-decoration: none;
  font-size: 17px;
  
}

.topnav a:hover {
  background-color: rgb(240, 226, 226);
  color: rgb(143, 88, 16);
}
.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
footer
{
  color: #f2f2f2;
  text-align: right;
  font-size: 18px;
}
div.gallery {
	margin: 5px;
	border: 1px solid #ccc;
	float: left;
	width: 180px;
}

div.gallery:hover {
	border: 1px solid black;
}

div.gallery img {
	width: 100%;
	height: auto;
	margin-top: 10px;
}

div.desc {
	padding: 15px;
	text-align: center;
}

body {
	background-color: lightcoral;
}
footer
{
  color: #f2f2f2;
  text-align: right;
  font-size: 18px;
}
</style>
</head>
<header>
<div class="headpart">
	<img src="pics/logo1.jpg">
	<h1 align="center">Welcome to Go shopping....!</h1>
</div>
</header>
<body>
<div class="topnav">
        <a class="active" href="#home">Home</a>
        <a href="aboutus.html">About Us</a>
        <a href="login.jsp" >Login</a>
        <a href="register.html" >Register</a>
      </div>

	<div class="w3-content w3-section"
		style="max-width: 200px, max-height=200px">
		<img class="mySlides" src="pics/OFFER1.jpg"  width="1000" height="400">
     <img class="mySlides" src="pics/kids1.jpg" width="1000" height="400">
     <img class="mySlides" src="pics/OFF3.jpg"  width="1000" height="400">
     <img class="mySlides" src="pics/sunoffer.jpg"  width="1000" height="400">
     <img class="mySlides" src="pics/shopping.jpg"  width="1000" height="400">
     <img class="mySlides" src="pics/OFFER2.jpg"  width="1000" height="400">  
     <img class="mySlides" src="pics/img1.jpg"  width="1000" height="400" >
     <img class="mySlides" src="pics/MOBILE.jpg"  width="1000" height="400" >
     <img class="mySlides" src="pics/men.png"  width="1000" height="400">
	</div>
	<script>
		var myIndex = 0;
		carousel();

		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 3000); // Change image every 4 seconds
		}
	</script>
	<div class="home">
<table border="1" align="center" width=100% >
    
    <tr>
      <td> <a target="_blank" href="login.jsp"><img src="pics/sundisp.jpg" width="650" height="400"></a>
        <div class="desc"><h1>Sunglasses</h1></div>
      </div>
      </td>
    



 
  <td> <a target="_blank" href="login1.jsp">
    <img src="pics/dress2.png" width=100%  height="400" ></a>
    <div class="desc"><h1>Clothing</h1></div>
  </td>
  </tr>



  <tr>
    <td colspan="2"> <a target="_blank" href="Login2.jsp">
      <img src="pics/md2.jpg" width=100%  height="400"></a>
      <div class="desc"><h1>Mobile</h1></div>
    </td>
  </tr>

  </table>

  <footer>
      © Copyright 2014, All Rights Reserved
      <br>
      <a href="www.google.com">goShoppingHelp@gmail.com</a>
   </footer>
</body>
</html>
