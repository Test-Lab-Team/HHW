<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<style>
</style>
<link rel="stylesheet" href="header.css">
<link rel="stylesheet" href="login.css">
<link
	href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>會員資料更改</title>
<script type="text/javascript">
	function confirmDelete(userId) {
		var result = confirm("確定刪除此筆記錄(帳號:" + userId + ")?");
		if (result) {
			document.forms[0].finalDecision.value = "DELETE";
			return true;
		}
		return false;
	}
	function confirmUpdate(userId) {
		var result = confirm("確定送出此筆記錄(帳號:" + userId + ")?");
		if (result) {
			document.forms[0].finalDecision.value = "UPDATE";
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<header>
		<div>
			<ul class="listst1">
				<li>
					<p class="titlest">
						<big><big><big>享玩 桌遊</big></big> </big>
					</p>
				</li>
				<p style="font-size: larger; font-weight: bold;">
					<big>讓因桌遊而產生的歡笑&emsp;充滿生命中的每分每秒</big>
				</p>
			</ul>
		</div>
		<hgroup>
			<h2 style="width: fit-content;">
				放輕心情&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a class="link"
					href="http://localhost:8080/JSPCrud/loginPage.jsp"
					onclick="checkout()">登出</a>
			</h2>
			<h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;享受與親友</h2>
			<h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;共同度過的桌遊時光</h2>
		</hgroup>
		<nav>
			<div>
				<span style="margin-left: 100px;">網站起源</span> <span>最新消息</span> <span>分類檢索</span>
				<span>購物車</span> <span>討論區</span> <span>會員中心</span> <span>聯絡我們</span>
			</div>
		</nav>

	</header>


<Form class='center' Action="MemberUpdateServlet" method="POST">
  <fieldset>
        <legend class="ti">會員資料編輯</legend>
			<input type="hidden" name="id" value="${mb.memId}"> <input
				type="hidden" name="account"
				value="${mb.memAccount}${param.memAccount}"> <input
				type="hidden" name="finalDecision" value="">
			<table>
			<tr><td>帳號Account:</td><td>${mb.memAccount}${param.memAccount}</td></tr>
			<tr><td>密碼Password:</td><td><input type="text" name="password" value="${mb.memPassword}${param.memPassword}" size="30"></td></tr>
			<tr><td>姓名Name:</td><td><input type="text" name="name" value="${mb.memName}${param.memName}" size="30"></td></tr>	
			<tr><td>性別Gender:</td><td><input type="radio" name="gender" value="male" checked="checked"/>男<input type="radio" name="gender" value="female"/>女</td></tr>	
			<tr><td>生日birthday:</td><td><input type="date" name="birthday" value="${mb.memBirthday}${param.memBirthday}"></td></tr>
			<tr><td>手機Phone:</td><td><input type="text" name="phone" value="${mb.memPhone}${param.memPhone}" size="30"></td></tr>
			<tr><td>信箱E-Mail:</td><td><input type="email" name="mailaddress" value="${mb.memMailaddress}${param.memMailaddress}" size="30"></td></tr>
			<tr><td>地址Address:</td><td><input type="text" name="address" value="${mb.memAddress}${param.memAddress}" size="30"></td></tr>
			<tr><td>身分證字號IdNumber:</td><td><input type="text" name="idNumber" value="${mb.memIdNumber}${param.memIdNumber}" size="30"></td></tr>
			<tr><td>大頭貼Photo:</td><td><input type="file" name="pic" value="${mb.memPic}${param.memPic}" size="30"></td></tr>
			
				<tr>
					<td colspan="2" align="center"><input class="login" type="submit" value="更新"
						name='updateBtn'
						onclick="return confirmUpdate('${member.userId}');"> <input
						type="submit" class="login"  value="刪除" name='deleteBtn'
						onclick="return confirmDelete('${member.userId}');"></td>
				</tr>
			</table>
			<c:if test="${not empty requestScope.modify}">
				<c:remove var="member" scope="request" />
			</c:if>
			</fieldset>
		</Form>
		<p />
	
</body>

</html>
