<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆界面</title>
<script type="text/javascript">
	//1. 创建对象
	function ajaxFunction() {
		var xmlHttp;
		try { // Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try {// Internet Explorer
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
		return xmlHttp;
	}
	function usercheck() {
		var username = document.getElementById("userid").value;
		var request = ajaxFunction();
		request.open("post", "/smartphone/AjaxServlet", true);
		request.onreadystatechange = function() {
			if (request.readyState == 4 && request.status == 200) {
				var data = request.responseText;
				if (data == 1) {
					document.getElementById("span01").innerHTML = "<font color='#00FF00'>用户名存在!</font>";
				} else {
					document.getElementById("span01").innerHTML = "<font color='red'>用户名不存在!</font>";
				}
			}
		};
		request.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		request.send("username=" + username);
	}
</script>
</head>
<div align="center">
	<body background="images/hj.jpg">
		<form method="post" action="LoginServlet"><br><br><br><br><br><br><br><br>
			<span style="color: red"><h1>手机数据管理系统</h1></span>
			<table border="1">
				<tr>
					<td><div style="color: #00FF00">
							账户： <input id="userid" type="text" name="username"
								onblur="usercheck()">
						</div></td>
					<td><span id="span01"></span></td>
				</tr>
				<tr>
					<td>
						<div style="color: #00FF00">
							密码： <input id="password" type="password" name="password">
						</div>
					</td>
				</tr>
				<tr>
					<td align="right"><input type="reset" value="重置"> 
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="submit" value="提交">
						
						
						</td>
				</tr>
			</table>
		</form>
	</body>
</div>
</html>