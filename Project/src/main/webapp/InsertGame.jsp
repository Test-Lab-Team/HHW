<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>新增遊戲資料</H1>
<form  action='InsertGameServlet'  method='POST'  >
<%-- 編號:<input type='text'      name='productId'   value='${param.productId}'> <br>  --%>

英文名字:<input type='text'  name='E_name' value='${param.E_name}'><br>

中文名字:<input type='text'      name='C_name' value='${param.C_name}'><br>
圖片連結:<input type='text'      name='img_url' value='${param.img_url}'><br>
創作者:<input type='text'      name='G_make' value='${param.G_make}'><br>
插畫家:<input type='text'      name='iss' value='${param.iss}'><br>
內容:<input type='text'      name='info' value='${param.info}'><br>
價錢:<input type='text'      name='Price' value='${param.Price}'><br>
瀏覽數:<input type='text'      name='viewCount' value='${param.viewCount}'><br>
上市日期:<input type='text'      name='date' value='${param.date}'><br>
庫存:<input type='text'      name='storage' value='${param.storage}'><br>


<input type='submit'      name='name' value='提交' >
<input type='reset'      name='name' value='清除' ><br><br>
</form>
</body>
</html>