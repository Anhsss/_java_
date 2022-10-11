<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num = 0;
String snum = request.getParameter("num");
if (snum != null && snum.equals("") == false) {
	num = Integer.parseInt(snum);
}
for (int i = num - 1; i >= 1; i--) {
	num = num * i;
}
//out.print(num);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial</title>
</head>
<body>
	<h2><%=snum%>의 팩토리얼은 <%=num%>입니다.
	</h2>
	<ul>
		<li>
			<% 
			out.println(snum + " != " + num);
			%>
		</li>
	</ul>
</body>
</html>