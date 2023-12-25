<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ex10a.Inquery" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<h1>以下の内容でよろしいですか</h1>

	<p> 氏名：<c:out value="${inquery.name}" /></p>
	<p> 年齢：<c:out value="${inquery.age}" /></p>

	<p> 郵便番号：<c:out value="${inquery.zipcode}" /></p>
	<p> 住所：<c:out value="${inquery.address}" /></p>
	<p> 本文：<c:out value="${inquery.body}" /></p>

	<p>
	<a href="done4">OK</a>
	<a href="inquery4">戻る</a>
	<p>

</body>
</html>