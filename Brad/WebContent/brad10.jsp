<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr>
		<%
			int lottery = (int)(Math.random()*49+1);
			out.println("Hello, World");
		%>
		<hr>
		這期要出<% out.println(lottery); %><br>
		這期要出<%= lottery %>
	</body>
</html>