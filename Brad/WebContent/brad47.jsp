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

<sql:query var="result">
	SELECT * FROM cust WHERE id = ?
	<sql:param>${param.editid }</sql:param>
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="brad47.jsp">
	Account: <input type="text" name="account" value="${result.rows[0].account }" /><br>
	Password: <input type="password" name="passwd" value="${result.rows[0].passwd }" /><br>
	Realname: <input type="text" name="realname" value="${result.rows[0].realname }" /><br>
	<input type="submit" value="Update" /><br>
</form>

</body>
</html>






