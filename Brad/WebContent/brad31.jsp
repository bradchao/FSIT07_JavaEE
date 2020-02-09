<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:directive.page import="tw.brad.beans.Member" />  
    
<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="account" value="${param.account }" name="member"/>
<jsp:setProperty property="realname" value="${param.realname }" name="member"/>
<jsp:setProperty property="age" value="${param.age }" name="member"/>

<jsp:declaration>
	int a;
	String b;
</jsp:declaration>
<jsp:scriptlet>
	a = 10; 
	b = "Brad";
</jsp:scriptlet>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Account = ${member.account }<br>
Realname = ${member.realname }<br>
Age = ${member.age }<br>
${member }
<hr>
a = <jsp:expression>a</jsp:expression><br>
b = <jsp:expression>b</jsp:expression><br>
<hr>
Member = <jsp:expression>member</jsp:expression><br>
Member = <%= member %><br>
Member = ${member }

</body>
</html>