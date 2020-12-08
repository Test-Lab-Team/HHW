<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="header.css">
<link rel="stylesheet" href="login.css">
<meta charset="UTF-8">
<title>會員清單</title>
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

	<form>
		<fieldset>
			<legend class="ti">會員清單</legend>
			<c:if test='${empty allMembers}'>
		查無會員資料<br>
			</c:if>
			<c:if test='${not empty allMembers}'>
				<c:forEach var='member' varStatus='vs' items='${allMembers}'>
					<c:if test='${vs.first }'>
						<c:out value="<table border='1'>" escapeXml='false' />
						<c:out
							value="<tr><td>帳號</td><td>密碼</td><td>姓名</td><td>性別</td>
				<td>生日</td><td>手機</td><td>信箱</td><td>地址</td><td>身分證字號</td>
				<td>剩餘回饋金</td><td>大頭貼</td></tr>"
							escapeXml='false' />
					</c:if>

					<tr>
						<td><a href='FindMemberServlet?key=${member.memId}'>${member.memAccount}</a></td>
						<td>${member.memPassword}</td>
						<td>${member.memName}</td>
						<td>${member.memGender}</td>
						<td>${member.memBirthday}</td>
						<td>${member.memPhone}</td>
						<td>${member.memMailaddress}</td>
						<td>${member.memAddress}</td>						
						<td>${member.memIdNumber}</td>
						<td>${member.memRefund}</td>
						<td>${member.memPic}</td>
					</tr>
					<c:if test='${vs.last }'>
						<c:out value="</table>" escapeXml='false' />
					</c:if>
				</c:forEach>
			</c:if>
			<a href='index.jsp'>回到會員管理</a>
			<img class="img1" src="images/5.png">
		</fieldset>
	</form>
</body>
</html>