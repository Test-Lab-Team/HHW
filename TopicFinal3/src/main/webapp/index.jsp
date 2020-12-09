<%@page import="ch01.model.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="header.css">
<link rel="stylesheet" href="login.css">
<meta charset="UTF-8">
<title>會員資料管理</title>
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
	<h2 style="width: fit-content;">放輕心情</h2>
	<h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;享受與親友</h2>
	<h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;共同度過的桌遊時光</h2>
	</hgroup> <nav>
	<div>
		<span style="margin-left: 100px;">網站起源</span> <span>最新消息</span> <span>分類檢索</span>
		<span>購物車</span> <span>討論區</span> <span>會員中心</span> <span>聯絡我們</span>
	</div>
	</nav> </header>
	<p>
	 ${account}歡迎登入
	</p>
	<form>
    <fieldset>
        <legend class="ti">會員資料維護</legend>
        <table cellspacing="2" cellpadding="1" width="100%">
				<tr>
					<td><a class="link" href='MemberForm.jsp'>新增會員資料</a></td>
					<td><a class="link" href='QueryAllMemberServlet'>查詢會員資料</a></td>	
				</tr>
				<tr>
					<td><a class="link" href='QueryAllMemberServlet'>修改會員資料</a></td>
					<td><a class="link" href='QueryAllMemberServlet'>刪除會員資料</a></td>
				</tr>		
				<tr>
					<td><a class="link" href="loginPage.jsp" onclick="checkout()">登出</a></td>
				</tr>		   
        </table>
        <br>
        <img class="img1" src="images/5.png">
    </fieldset>
    </form>           
<script>
        function checkout() {
        	alert("已登出,歡迎下次再來")
        	}
</script>
	
</body>
</html>