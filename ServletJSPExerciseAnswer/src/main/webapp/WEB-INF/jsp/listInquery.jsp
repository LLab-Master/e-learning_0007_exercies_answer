<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>問い合わせ一覧</h1>

	<table border="1">
		<tr>
			<th>氏名</th>
			<th>年齢</th>
			<th>郵便番号</th>
			<th>住所</th>
			<th>内容</th>
		</tr>
		<c:forEach var="inquery" items="${inqueryList}">
			<tr>
				<td>${inquery.name}</td>
				<td>${inquery.age}</td>
				<td>${inquery.zipcode}</td>
				<td>${inquery.address}</td>
				<td>${inquery.body}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>