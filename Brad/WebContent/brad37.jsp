<%@page import="tw.brad.myutils.BradAPI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="brad37.jsp">
	<input type="number" name="x" value="${param.x }"/>
	<select name="op">
		<option value="1">+</option>
		<option value="2">-</option>
		<option value="3">x</option>
		<option value="4">/</option>
	</select>
	<input type="number" name="y" value="${param.y }"/>
	<input type="submit" value="=" />
	${BradAPI.calc(param.x, param.y, param.op) }
</form>
</body>
</html>