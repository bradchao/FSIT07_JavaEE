<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Brad</h1>

<hr>
<jsp:forward page="brad28.jsp">
	<jsp:param value="123" name="var1"/>
	<jsp:param value="456" name="var2"/>
</jsp:forward>
<hr>



</body>
</html>