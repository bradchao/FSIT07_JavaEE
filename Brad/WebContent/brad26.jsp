<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java_ee20200209.Member" %>
<%
	Member member = (Member)application.getAttribute("member");
	member.addAge();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= member.getAccount() %> :
<%= member.getAge() %>
</body>
</html>