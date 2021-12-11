<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>手机数据管理系统</title>
 
<script type="text/javascript">
function deletefn(id) {
	/* 如果这里弹出的对话框，用户点击的是确定，就马上去请求Servlet。 
	如何知道用户点击的是确定。
	如何在js的方法中请求servlet。 */
	var flag = confirm("是否确定删除?");
	if(flag){
		//表明点了确定。 访问servlet。 在当前标签页上打开 超链接，
		//window.location.href="DeleteServlet?sid="+sid;
		location.href="DeleteServlet?id="+id;
}
}
</script>

</head>

<div align="center">
	<body background="images/yj.jpg">
		<table border="1">
			<tr>
				<td><div style="color: red">登陆状态</div></td>
				<td><div style="color: red">登陆名称</div></td>
				<td><div style="color: red">登陆密码</div></td> 
				<td><div style="color: red">系统出口</div></td>
			</tr>
			<tr>
				<td><div style="color: #00FF00">成功</div></td>
				<td><div style="color: #00FF00">${Login.username}</div></td>
				<td><div style="color: #00FF00">${Login.password}</div></td> 
				<td><a href="ExitServlet" style="color: #00FF00">退出系统
						</div></td>
			</tr>
		</table>
	</body>
</div>
<table>
	<tr>
		<td><div style="color: red">手机数据管理系统功能区</div></td>
		<br>
	</tr>
</table>  
<a href="PageT_smtphServlet?currentPage=1" style="color: orange;"> 
       查询手机管理信息</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="add.jsp" style="color: orange;" > 添加新的机型</a> 
<div align="center">
	<form action="SelectUserServlet" method="post">
		<table border="1" style="color: threedface;"> 

			<tr>
				<td style="color: red">手机编号</td>
				<td style="color: red">名称</td>
				<td style="color: red">品牌</td> 
				<td style="color: red">价格</td> 
				<td style="color: red">电池</td>  
				<td style="color: red">出厂时间</td>  
				<td style="color: red">删除</td>
				<td style="color: red">修改</td>
			</tr>
			<c:forEach items="${PageBean.list}" var="list" varStatus="status">  
			<c:if test="${status.index % 2 == 0}">
			<tr  class = "even"> 
				<tr>
					<td style="color:blue;">${list.id}</td>
					<td style="color: blue;">${list.name}</td>
					<td style="color: blue;">${list.brand}</td>
					<td style="color: blue;">${list.price}</td>
					<td style="color: blue;">${list.battery}</td>
					<td style="color: blue;">${list.release_date}</td> 
<td><a href="#" style="color: orange;" onclick="deletefn(${list.id})">删除</a></td>
<td><a href="UpdateServlet?id=${list.id}" style="color: orange;">修改</a></td>
				</tr> 
				
				</tr>
				</c:if>
				
				<c:if test="${status.index % 2 == 1}">
			<tr  class = "odd"> 
				<tr>
					<td style="color:red;">${list.id}</td>
					<td style="color: red;">${list.name}</td>
					<td style="color: red;">${list.brand}</td>
					<td style="color: red;">${list.price}</td>
					<td style="color: red;">${list.battery}</td>
					<td style="color: red;">${list.release_date}</td> 
					<td><a href="#" style="color: orange;" onclick="deletefn(${list.id})">删除</a></td> 
                    <td><a href="UpdateServlet?id=${list.id}" style="color: orange;">修改</a></td>
</tr> 
				</tr> 
				</c:if>
			</c:forEach>
			<tr>
				<td colspan="8">第 ${PageBean.currentPage } /
					${PageBean.totalPage } &nbsp;&nbsp; 每页显示${PageBean.pageSize }条
					&nbsp;&nbsp;&nbsp; 总的记录数${PageBean.totalSize } &nbsp;&nbsp;&nbsp; <c:if
						test="${PageBean.currentPage !=1 }">
						<a href="PageT_smtphServlet?currentPage=1">首页</a>
						| <a href="PageT_smtphServlet?currentPage=${PageBean.currentPage-1 }">上一页</a>
					</c:if> <c:forEach begin="1" end="${PageBean.totalPage }" var="i">
						<c:if test="${PageBean.currentPage == i }">
			  				${i }
			  			</c:if>
						<c:if test="${PageBean.currentPage != i }">
							<a href="PageT_smtphServlet?currentPage=${i }">${i }</a>
						</c:if>
					</c:forEach> <c:if test="${PageBean.currentPage !=PageBean.totalPage }">
						<a href="PageT_smtphServlet?currentPage=${PageBean.currentPage+1 }">下一页</a> | 
			  			<a href="PageT_smtphServlet?currentPage=${PageBean.totalPage }">尾页</a>
					</c:if>
			</tr>
		</table>
	</form>
</div>
</html>