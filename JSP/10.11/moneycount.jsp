<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int money = 0;
String price = request.getParameter("money");
if (price != null && price.equals("") == false) {
	money = Integer.parseInt(price);
}
int oman = money / 50000;
int man = (money % 50000) / 10000;
int ochun = (money % 10000) / 5000;
int chun = (money % 5000) /1000;
%>
<html>
<head>
<meta charset="UTF-8">
<title>money count</title>
</head>
<body>
	<h2>필요한 지폐 장수</h2>
	<ul>
		<li>5만원 : <%= oman %>장</li>
		<li>1만원 : <%= man %>장</li>
		<li>5천원 : <%= ochun %>장</li>
		<li>1천원 : <%= chun %>장</li>
	</ul>
</body>
</html>