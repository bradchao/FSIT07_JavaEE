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
	
<c:set var="rpp" value="10" />	
<c:set var="page" value="${param.page == null ? 1 : param.page }" />
<c:set var="start" value="${(page - 1) * rpp }" />
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
總筆數: ${result.rowCount }
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