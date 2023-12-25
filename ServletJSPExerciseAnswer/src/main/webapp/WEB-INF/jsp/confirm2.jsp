<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex8a.Inquery" %>
<% Inquery inquery = (Inquery)session.getAttribute("inquery"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<h1>以下の内容でよろしいですか</h1>
	
	<p> 氏名：<%=inquery.getName() %></p>
	<p> 年齢：<%=inquery.getAge() %></p>

	<p> 郵便番号：<%=inquery.getZipcode() %></p>
	<p> 住所：<%=inquery.getAddress() %></p>
	<p> 本文：<%=inquery.getBody() %></p>

	<p>
	<a href="done2">OK</a>
	<a href="inquery2">戻る</a>
	<p>

</body>
</html>