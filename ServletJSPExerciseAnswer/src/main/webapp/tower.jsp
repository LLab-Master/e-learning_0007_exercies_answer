<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tower</title>
</head>
<body>
	<%--  int x, y; --%>
	<%  for (int x = 0; x < 10; x++) { %>
		<%  for (int y = 0; y < x + 1; y++) { %>
			*
		<% } %>
		<br>
	<% } %>
</body>
</html>