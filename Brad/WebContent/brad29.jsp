<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="account" value="brad" name="member"/>
<jsp:setProperty property="realname" value="Brad Chao" name="member"/>
<jsp:setProperty property="age" value="18" name="member"/>


<jsp:useBean id="member2" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="account" value="tony" name="member2"/>
<jsp:setProperty property="realname" value="Tony Cheng" name="member2"/>
<jsp:setProperty property="age" value="40" name="member2"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Account : <jsp:getProperty property="account" name="member"/><br>
Realname : <jsp:getProperty property="realname" name="member"/><br>
Age : <jsp:getProperty property="age" name="member"/><br>
<hr>
Account : <jsp:getProperty property="account" name="member2"/><br>
Realname : <jsp:getProperty property="realname" name="member2"/><br>
Age : <jsp:getProperty property="age" name="member2"/><br>

</body>
</html>