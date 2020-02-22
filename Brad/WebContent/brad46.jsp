<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<c:if test="${!empty param.account }">
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/iii?serverTimezone=Asia/Taipei"
		user="root"
		password="root"
		/>
	<sql:update var="count">
		INSERT INTO cust (account,passwd,realname) values (?,?,?)
		<sql:param>${param.account }</sql:param>
		<sql:param>${param.passwd }</sql:param>
		<sql:param>${param.realname }</sql:param>
	</sql:update>
	<c:redirect url="brad45.jsp"></c:redirect>
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="brad46.jsp">
	Account: <input type="text" name="account" /><br>
	Password: <input type="password" name="passwd" /><br>
	Realname: <input type="text" name="realname" /><br>
	<input type="submit" value="Add" /><br>
</form>

</body>
</html>