<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加手机信息</title>
</head>
<body>
<div align="center"  > 
<form action="AddServlet" method="post">
<table border="1" style="color: lime;">  
<br/><br/><br/><br/><br/><br/><br/><br/><tr>
	<td>名称</td>
	<td><input type="text" name="name" placeholder="输入名称"></td>
</tr>
<tr>
	<td>品牌</td>
	<td><input type="text" name="brand" placeholder="输入品牌"></td>
</tr>
<tr>
	<td>价格</td>
	<td><input type="text" name="price" placeholder="输入价格"><a style="color: red;">（用整数）</a></td>
</tr>
<tr>
	<td>电池</td>
	<td><input type="text" name="battery" placeholder="输入电池"></td>
</tr>
<tr>
	<td>日期</td>
	<td><input type="text" name="release_date" placeholder="输入日期"></td> 
</tr>
 
<tr> 
	<td ><input type="submit" value="提交"></td>
</tr>
</table>
</form>
</div>
</body>
</html>