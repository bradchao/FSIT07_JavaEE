<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"value1","value2","value3","value4","value5","value6"};
	pageContext.setAttribute("username", var1);
	
	String[] var2 = {"brad1","brad2","brad3","brad4",};
	request.setAttribute("username", var2);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Username1: ${username[1] }<br>
Username2: ${requestScope.username[1] }<br>
<%= var2[0] %>


</body>
</html>