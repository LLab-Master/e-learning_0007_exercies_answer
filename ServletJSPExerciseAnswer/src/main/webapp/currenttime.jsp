<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date, java.text.SimpleDateFormat" %>
<%
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
	String formatDate = sdf.format(now);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>現在時刻の表示</title>
</head>
<body>
		<h1>現在時刻: <%= formatDate %></h1>
</body>
</html>