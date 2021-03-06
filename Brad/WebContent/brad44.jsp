<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/iii?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
	/>
<sql:query var="rs1">
SELECT * FROM opendata
</sql:query>

<c:set var="rpp" value="10" />	
<%
	Result result =  (Result)pageContext.getAttribute("rs1");
	int rowCount = result.getRowCount();
	int rpp = Integer.parseInt((String)pageContext.getAttribute("rpp"));
	int pages = rowCount % rpp == 0 ? rowCount/rpp : rowCount/rpp+1;// int ==> Integer
	pageContext.setAttribute("pages", pages);
%>
<c:set var="page" value="${param.page == null ? 1 : param.page }" />
<c:set var="start" value="${(page - 1) * rpp }" />
<c:set var="prev" value="${page == 1? 1 : page-1 }" />
<c:set var="next" value="${page == pages? page : page + 1 }" />

<sql:query var="result">
SELECT * FROM opendata limit ${start }, ${rpp }
</sql:query>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="?page=${prev }">Prev</a> | <a href="?page=${next }">Next</a>
<hr >
<table border="1" width="100%">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Tel</th>
		<th>LatLng</th>
		<th>Picture</th>
	</tr>
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }</td>
			<td>${row.cname }</td>
			<td>${row.address }</td>
			<td>${row.tel }</td>
			<td>${row.latlng }</td>
			<td><img src="${row.picurl }" width="128px" height="72px"></td>
		</tr>
	</c:forEach>
</table>


</body>
</html>