<%@page import="tw.brad.beans.Member"%>
<%@page import="tw.brad.myutils.BradAPI"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"value1","value2","value3","value4","value5","value6"};
	pageContext.setAttribute("username", var1);
	
	String[] var2 = {"brad1","brad2","brad3","brad4",};
	request.setAttribute("username", var2);

	LinkedList<String> list = new LinkedList<>();
	list.add("AAA"); list.add("BBB");list.add("CCC");
	request.setAttribute("listdata", list);
	
	HashMap<String,String> map = new HashMap<>();
	map.put("k1", "v1");map.put("k2", "v2");map.put("k3", "v3");
	request.setAttribute("map", map);
	
	Member member = new Member();
	member.setAccount("brad");
	member.setAge(18);
	member.setRealname("Brad Chao");
	request.setAttribute("member", member);
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Username1: ${username["2"] }<br>
Username2: ${requestScope.username[1] }<br>
<%= var2[0] %><br>
List1: ${listdata["0"] }<br>
List1: ${listdata[1] }<br>
List1: ${listdata[param.i] }<br>
Map1: ${map["k1"] }<br>
Map2: ${map.k2 }<br>
Map3: ${map[param.key] }<br>
Lottery1: <%= BradAPI.createLottery() %><br>
Lottery2: ${BradAPI.createLottery() }<br>
random: ${Math.random() }<br>
Hello: ${BradAPI.sayHello(param.name) }<br>
${10 + 3 }<br>
${param.x } > ${param.y } => ${param.x > param.y }<br><!-- "10" > "3"  -->
${(param.x == "10")?"Yes":"No" }<br>
${10 > 3 }<br>
Account: ${member.account }<br>	<!--  member.getAccount() -->
Age:${member.account }<br>
Realname:${member.realname }<br>

</body>
</html>