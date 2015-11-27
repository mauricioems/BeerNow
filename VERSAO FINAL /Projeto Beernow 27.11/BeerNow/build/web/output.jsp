<%-- 
    Document   : output
    Created on : 27/09/2015, 21:41:34
    Author     : vntranb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<title>Output page: Fetching the value from session</title>
</head>
<body> 
<% 
String name=(String)session.getAttribute("sessname"); 
out.print("Hello User: You have entered the name: "+name); 
%> 
</body> 
</html>
