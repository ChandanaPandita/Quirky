<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  
  <title>Mychoice</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
  
<style>
#adidas{
position: relative;
left: 200px;
}
</style>
  
</head>
 <body style="height:1500px id="myPage" data-spy="scroll" data-target=".navbar" data-offset="40" background="C:\Users\user\Pictures\white.jpg">
<!-- 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <img src="C:\Users\user\Pictures\logo1.png" width="50" height="50">
</div>
      <a class="navbar-brand" href="#myPage"><i>MYCHOICE</i></a>
</div>
     <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-left">
       
        <li><a href="#">CATEGORIES</a></li>
        <li><a href="#login">LOGIN</a></li>
        
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>-->


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <img src=<c:url value="/resources/images/logo1.png"/> width="50" height="50">
</div>
      <a class="navbar-brand" href="#myPage"><i>MYCHOICE</i></a>
</div>
     <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      <!-- > <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">BAGS
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Women</a></li>
            <li><a href="#">Men</a></li>
          </ul>
        </li>-->
        
        <li><a href="logout">LOGOUT</a></li>        
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>