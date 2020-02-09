<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name= request.getParameter("name");
	if (name == null) name = "OK";
	request.setAttribute("lottery", (int)(Math.random()*49+1)+"");
	
	pageContext.setAttribute("key1", "value1");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Brad Big Company</h1>
<hr>
<%@ include file="brad21.jsp" %>
<hr>
<%= (String)(pageContext.getAttribute("key1")) %>
</body>
</html>