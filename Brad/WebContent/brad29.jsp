<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="account" value="brad" name="member"/>
<jsp:setProperty property="realname" value="Brad Chao" name="member"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Account : <jsp:getProperty property="account" name="member"/><br>
Realname : <jsp:getProperty property="realname" name="member"/><br>
</body>
</html>