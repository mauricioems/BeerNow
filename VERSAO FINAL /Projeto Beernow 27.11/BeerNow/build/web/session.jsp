<%-- 
    Document   : session
    Created on : 27/09/2015, 21:42:08
    Author     : vntranb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<title>Passing the input value to a session variable</title>
</head>
<body> 
<% 
String uname=request.getParameter("Username"); 
String pass=request.getParameter("Password"); 
out.print("Welcome "+ uname);
out.print("Your password is "+ pass);
session.setAttribute("sessname",uname); 
%> 
<a href="output.jsp">Check Output Page Here </a>
</body> 
</html>
