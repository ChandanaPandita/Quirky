<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<% 
session.invalidate();
%>
<center>
<p>Its an happy shopping website.</p>
<p>Thanks for shopping.</p>
<p>Happy Regards.</p>
<h4><font color="red">THANKS FOR SHOPPING WITH MYCHOICE</font></h4>
<br/><br/><br/><br/><a href="home">Home</a></center>
</body>

 <br/>
 <br/>
 <br/><br/><br/><br/><br/><br/><br/><br/>
 <br/><br/><br/><br/><br/><br/><br/><br/>
 <br/><br/><br/><br/>
    <%@include file="footer.jsp" %>>