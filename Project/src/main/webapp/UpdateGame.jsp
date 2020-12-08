<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function confirmUpdate(productId) {
		var result = confirm("確定編輯此筆資料(編號:" + productId + ")?");
		if (result) {
			document.forms[0].finalDecision.value = "UPDATE";
			return true;
		}
		return false;
	}
</script>
</head>
<body>
<form action='UpdateGameServlet'>
	<table border='1'>
		<tr>
			<th>項目</th>
			<th width='500px'>內容</th>
		</tr>
		<tr>
			<td>遊戲編號 :</td>
			<td><input type="text" name="productId" value="${param.productId}" ></td>
		</tr>
		<tr>
			<td>英文名稱 :</td>
			<td><input type="text" name="E_name" value="${gb.e_name}${param.e_name}" ></td>
		</tr>
		<tr>
			<td>中文名稱 :</td>
			<td><input type="text" name="C_name" value="${gb.c_name}${param.c_name}" ></td>
		</tr>
		<tr>
			<td>圖片連結 :</td>
			<td><input type="text" name="img_url" value="${gb.img_url}${param.img_url}" ></td>
		</tr>
		<tr>
			<td>作者 :</td>
			<td><input type="text" name="G_make" value="${gb.g_maker}${param.G_make}" ></td>
		</tr>
		<tr>
			<td>插畫家 :</td>
			<td><input type="text" name="iss" value="${gb.iss}${param.iss}" ></td>
		</tr>
		<tr>
			<td>資訊 :</td>
			<td><input type="text" name="info" value="${gb.info}${param.info}" ></td>
		</tr>
		<tr>
			<td>價錢 :</td>
			<td><input type="text" name="Price" value="${gb.price}${param.Price}" ></td>
		</tr>
		<tr>
			<td>瀏覽數 :</td>
			<td><input type="text" name="viewCount" value="${gb.viewCount}${param.viewCount}" ></td>
		</tr>
		<tr>
			<td>上市日期 :</td>
			<td><input type="text" name="date" value="${gb.date}${param.date}" ></td>
		</tr>
		<tr>
			<td>庫存 :</td>
			<td><input type="text" name="storage" value="${gb.storage}${param.storage}" ></td>
		</tr>

		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="更新"	name='updateBtn' onclick="return confirmUpdate('${gb.productId}');">
		</td>
		</tr>
	</table>
	</form>

</body>
</html>