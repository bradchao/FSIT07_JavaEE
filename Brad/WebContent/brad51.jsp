<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="brad" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<brad:sayHello user="Brad" />
<brad:calc x="10" y="3">
10 + 3 = ${add }<br>
10 - 3 = ${sub }<br>
10 * 3 = ${multiply }<br>
10 / 3 = ${divide }<br>
</brad:calc>
${add }
<brad:dojsp/>
<hr />
<table border="1" width="100%">
	<tr>
		<th>Product Name</th>
		<th>Price</th>
	</tr>
	<brad:myjsp name="Camera" price="1,000" />
	<brad:myjsp name="Mouse" price="200" />
	<brad:myjsp name="iPhone" price="31,000" />
	
</table>


</body>
</html>