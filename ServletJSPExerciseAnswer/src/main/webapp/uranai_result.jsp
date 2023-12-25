<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
		
	int fortune = new java.util.Random().nextInt(4) + 1;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占いの館</title>
</head>
<body>
	<h1>占いの結果がでました</h1>
	<%= age %> 歳の <%= name %> さん、あなたの運気番号は <%= fortune %> です。<br>
	1:大吉 2:中吉 3:吉 4:凶

</body>
</html>