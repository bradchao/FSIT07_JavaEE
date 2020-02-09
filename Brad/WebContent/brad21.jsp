<%
	//String name = request.getParameter("name");
	String lottery = (String)(request.getAttribute("lottery"));
%>
<div style="background-color: rgb(255,255,0)">
Hello, <%= name %>,<br>
==> <%= lottery %><br>
<%= (String)(pageContext.getAttribute("key1")) %>
</div>
