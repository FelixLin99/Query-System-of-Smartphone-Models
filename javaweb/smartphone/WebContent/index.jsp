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
</script>
</head>
<div align="center"> 
		<form method="post" action="LoginServlet"><br><br><br><br><br><br><br><br>
			<span style="color: red"><h1>手机数据管理系统</h1></span>
			<table border="1">
				<tr>
					<td><div style="color: #00FF00">
							账户： <input id="username" type="text" name="username"
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