<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>遊戲資料搜尋</h1>
<form action='SearchGameServlet' method='POST'>
遊戲編號 :<input type='text' name='productId' value='${param.productId}'>
<input type='submit' value='送出'>
<input type='reset' value='清除'>
</form>

</body>
</html>