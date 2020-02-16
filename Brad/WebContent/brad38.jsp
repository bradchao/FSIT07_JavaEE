<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// taglib, JSTL
	// tomcat taglib download
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="member1" class="tw.brad.beans.Member"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//pageContext.setAttribute("x", "123");
%>
<c:set var="x" value="123" scope="page" />
x = ${x }<br>
<%
	//request.setAttribute("x", "123");
%>
<c:set var="x" value="456" scope="request" />
x = ${requestScope.x }<br>

<c:out value="Hello, World" /><br>
<c:out value="${'Hello, World' }" /><br>
<c:out value="${y }" default="no y" /><br>
${y != null? y : "no value" }<br>

<c:set var="var1">9487</c:set>
<c:out value="${var1 }" default="none" /><br>
<hr>
${member1 }<br>
<c:set target="${member1 }" property="account">Brad</c:set>
<c:set target="${member1 }" property="age">18</c:set>
<c:set target="${member1 }" property="realname" value="Brad Chao" />
${member1.account }:${member1.realname }:${member1.age }<br>
${member1 }<br>
<c:remove var="member1"/>
${member1 }<br>






</body>
</html>