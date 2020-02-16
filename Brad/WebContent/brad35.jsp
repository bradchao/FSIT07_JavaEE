<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 隱含物件 request
	String method = request.getMethod();
	// 隱含物件 out => response.getWriter() => PrintWriter
	out.println(method + "<br>");
	
	// 隱含物件 pageContext
	HttpServletRequest sr = 
		(HttpServletRequest)pageContext.getRequest();
	out.println((sr == request) + "<br>");
	
	String remoteIP = request.getRemoteAddr();
	out.println(remoteIP + "<br>");
	
	String qs = request.getQueryString();
	out.println(qs + "<br>");
	
	String[] likes = request.getParameterValues("like");
	
	String country = 
			pageContext.getResponse().getLocale().getDisplayCountry();
	out.println(country);
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
Method = ${pageContext.request.method }<br>
Remote IP = ${pageContext.request.remoteAddr }<br>
QueryString = ${pageContext.request.queryString }<br>
Account: ${param.account }<br>
Password: ${param.passwd }<br>
Like1 : ${paramValues.like[0] }<br>
Like2 : ${paramValues.like[1] }<br>
Like3 : ${paramValues.like[2] }<br>
Country: ${pageContext.response.locale.displayCountry }<br>


</body>
</html>