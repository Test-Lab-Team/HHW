<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>會員登入</title>
    <link rel="stylesheet" href="header.css">
    <link rel="stylesheet" href="login.css">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    <style>

    </style>
</head>

<body>
    <header>
        <div>
            <ul class="listst1">
                <li>
                    <p class="titlest"><big><big><big>享玩 桌遊</big></big>
                        </big>
                    </p>
                </li>
                <p style="font-size: larger;font-weight:bold;"><big>讓因桌遊而產生的歡笑&emsp;充滿生命中的每分每秒</big></p>
            </ul>
        </div>
        <hgroup>
            <h2 style="width: fit-content;">放輕心情</h2>
            <h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;享受與親友</h2>
            <h2 style="width: fit-content;">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;共同度過的桌遊時光</h2>
        </hgroup>
        <nav>
            <div>
                <span style="margin-left: 100px ;">網站起源</span>
                <span>最新消息</span>
                <span>分類檢索</span>
                <span>購物車</span>
                <span>討論區</span>
                <span>會員中心</span>
                <span>聯絡我們</span>
            </div>
        </nav>

    </header>
    <form action="LoginServlet" method="post">
    <fieldset>
        <legend class="ti">會員登入</legend>
         <div align="center">
   <% if(request.getAttribute("msg") != null) { %>
    <p style="color: red">
     <%= request.getAttribute("msg") %>
    </p>
   <% } %>
   </div>
        <table>
				<tr>
					<td>帳號ID:</td>
					<td><input type="text" name="account" id="account" size="30"
						maxlength="20" onblur="checkId()"><span id="sp1"></span></td>	
				</tr>
				<tr>
					<td>密碼Password:</td>
					<td><input type="password" name="password" id="password"
						size="30" maxlength="20" onblur="checkPassword()">
						<i class="fa fa-eye" onclick="showhide()" id="eye"></i>
						<span id="sp2"></span></td>
				</tr>				   
        </table>
        <br>
        <center>
        <input class="login" type="submit" value="登入">
        <br>
        <a class="link" href='MemberForm.jsp'>註冊新會員</a>
        <a class="link" href="https://www.xujisunrise.com.tw/zh-TW/home">忘記帳號</a>
        <a class="link" href="https://www.xujisunrise.com.tw/zh-TW/home">忘記密碼</a>
        <br>
        <button type="button" style="background-color:blue ; color:white">FB登入</button>&emsp;
        <button type="button" style="background-color:green ; color:white">Google登入</button>&emsp;
        <button type="button" style="background-color:red ; color:white">IG登入</button>
        </center>
        <img class="img1" src="images/5.png">
    </fieldset>
    <script src="register.js"></script>
    </form>
</body>

</html>