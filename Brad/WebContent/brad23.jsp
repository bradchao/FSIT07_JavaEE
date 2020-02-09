<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int lottery1 = (int)(Math.random()*49+1);
	int lottery2 = (int)(Math.random()*49+1);
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

<!--  request paramter -->
<jsp:include page="brad24.jsp">
	<jsp:param name="key1" value="<%= lottery1 %>" />
	<jsp:param name="key2" value="<%= lottery2 %>" />
</jsp:include>

<hr>

</body>
</html>