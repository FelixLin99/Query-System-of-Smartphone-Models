<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改手机信息</title>
</head>
<body>
	<div align="center">
		<body background="images/st.jpg"> 
	<br/><br/><br/><br/><br/><br/><br/><br/><tr>
			<form action="Update02Servlet" method="post">  
				<table border="1" style="color: red;"> 
				
					<tr>
						<td>编号</td>
						<td><input type="text" name="id" value="${st.id }" readonly="readonly"></td>
					</tr>
				<tr>
						<td>名称</td>
						<td><input type="text" name="name" value="${st.name }"></td>
					</tr>
					<tr>
						<td>品牌</td>
						<td><input type="text" name="brand" value="${st.brand }"></td>
					</tr>
					 
					<tr>
						<td>价格</td>
						<td><input type="text" name="price" value="${st.price }"></td>
					</tr>
					<tr>
						<td>电池</td>
						<td><input type="text" name="battery" value="${st.battery }"></td>
					</tr>
					<tr>
						<td>日期</td>
						<td><input type="text" name="release_date" value="${st.release_date }"></td>
					</tr>
					 
					 
					<tr>
						<td colspan="2"><input type="submit" value="提交"></td>
					</tr>
				</table>
			</form>
	</div>
</body>
</html>