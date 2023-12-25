<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<h1>お問い合わせ</h1>
	
	<p>${message}</p>
	<form action="inquery3" method="post">
		
		氏名（必須）：<input type="text" name="name" ><br>
		年齢：<input type="text" name="age" ><br>
		<br>	
		郵便番号：<input type="text" name="zipcode" >(3桁ー４桁で入力)<br>
		住所：<input type="text" name="address" ><br>
		<br>
		お問い合わせ内容<br>
		<textarea name="body"></textarea>
		<br>
		
		
		<input type="submit" value="送信">
		
	</form>
</body>
</html>