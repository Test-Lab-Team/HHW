<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊新會員</title>
<link rel="stylesheet" href="header.css">
    <link rel="stylesheet" href="login.css">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
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

<form action="InsertMemberServlet" method="post">
		<fieldset>
			<legend class="ti">註冊新會員</legend>
			<table cellspacing="2" cellpadding="1" width="100%">
				<tr>
					<td>帳號ID:</td>
					<td><input type="text" name="account" value="${param.account}" id="account" size="30"
						maxlength="20" onblur="checkId()"><span id="sp1"></span></td>	
				</tr>
				<tr>
					<td>密碼Password:</td>
					<td><input type="password" name="password" value="${param.password}" id="password"
						size="30" maxlength="20" onblur="checkPassword()">
						<i class="fa fa-eye" onclick="showhide()" id="eye"></i>
						<span id="sp2"></span></td>
				</tr>
				<tr>
					<td>確認密碼Password:</td>
					<td><input type="password" name="cpassword" id="cpassword"
						size="30" maxlength="20" onblur="checkPasswordAgain()">
						<i class="fa fa-eye" onclick="showhide1()" id="eye"></i>
						<span id="sp3"></span></td>
				</tr>
				<tr>
					<td>姓名Name:</td>
					<td><input type="text" name="name" value="${param.name}" id="name" size="30" 
						maxlength="20" onblur="checkName()"><span id="sp4"></span></td>					
				</tr>
				<tr>
					<td>性別Gender:</td>
					<td><input type="radio" name="gender" id="gender" value="male">男<input
						type="radio" name="gender" id="gender" value="female">女</td>
				</tr>
				<tr>
					<td>生日Birthday:</td>
					<td><input type="date" name="birthday" id="birthday">
					</td>
				</tr>
				<tr>
					<td>手機Phone:</td>
					<td><input type="text" name="phone" value="${param.phone}" id="phone" size="30"
						maxlength="20" onblur="checkPhone()"><span id="sp5"></span></td>			
				</tr>
				<tr>
					<td>信箱E-mail:</td>
					<td><input type="email" name="mailaddress" value="${param.mailaddress}" id="mailaddress"
						size="30" maxlength="30" onblur="checkMail()"><span id="sp6"></span></td>					
				</tr>
				<tr>
					<td>地址Address:</td>
					<td><input type="text" name="address" value="${param.address}" id="address"
						size="30" maxlength="30" onblur="checkAddress()"><span id="sp7"></span></td>					
				</tr>
					<tr>
					<td>身分證字號IdNumber:</td>
					<td><input type="text" name="idNumber" value="${param.idNumber}" id="idNumber"
						size="30" maxlength="30" onblur="checkIdNumber()"><span id="sp8"></span></td>					
				</tr>
					<tr>
					<td>大頭貼Photo:</td>
					<td><input type="file" name="pic" value="${param.pic}" id="pic"
						size="30" maxlength="30" onblur="checkIdNumber()"><span id="sp8"></span></td>					
				</tr>
				
			</table>
			<br>
			<center>
				<input class="login" type="submit" name="submit" value="確認註冊"> <input
					class="login" type="reset" value="清除重填">
			</center>
			<img class="img1" src="images/5.png">
		</fieldset>
		<script src="register.js"></script>
	</form>
	

</body>
</html>