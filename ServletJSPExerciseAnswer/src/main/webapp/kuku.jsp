<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>九九の表</title>
</head>
<body>
	<h1>九九の表</h1>
	<table border="1">
		<% for (int i = 1; i < 10; i++) { %>
			<tr>
			<% for (int j = 1; j < 10; j++) { %>
				<td><%= i * j %></td>
			<% } %>
			</tr>
		<% } %>
	</table>
</body>
</html>