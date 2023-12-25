<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex6b.Inquery" %>
<% Inquery inquery = (Inquery)request.getAttribute("inquery"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<h1>以下の内容で受け付けました</h1>

	<p> 氏名：<%=inquery.getName() %></p>
	<p> 年齢：<%=inquery.getAge() %></p>

	<p> 郵便番号：<%=inquery.getZipcode() %></p>
	<p> 住所：<%=inquery.getAddress() %></p>
	<p> 本文：<%=inquery.getBody() %></p>
	
	
	
	
</body>
</html>