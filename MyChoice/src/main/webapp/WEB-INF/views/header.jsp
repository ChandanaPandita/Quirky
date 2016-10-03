<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  
<style>
#adidas{
position: relative;
left: 200px;
</style>
  
</head>
<body>

 
<nav class="navbar navbar-default navbar-fixed-top">
 <img src=<c:url value="/resources/images/logo1.png"/> width="50" height="50">
 <a class="navbar-brand" href="#myPage">MYCHOICE</a>
  <div class="container-fluid">
    <div class="navbar-header">

      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-left">
       <li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">WOMEN</a>
<ul class="dropdown-menu">
<li>
<a href="Bags?category=Baggit">Baggit</a>
</li>
<li>
<a href="Bags?category=Caprese">Caprese</a>
</li>
</ul>
</li>

<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">MEN</a>
<ul class="dropdown-menu">
<li>
<a href="Bags?category=Addidas">Addidas</a>
</li>
<li>
<a href="Bags?category=Puma">Puma</a>
</li>
</ul>
</li>
          </ul>
        </li>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="about">ABOUT US</a></li>
        <li><a href="signUp">SIGNUP</a></li>
        <li><a href="AsCustomer">LOGIN</a></li>
        
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>
<body style="background-image: url("resources/images/white.jpg")">