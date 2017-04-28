<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>账号</th>
			<th>密码</th>
			<th>生日</th>
			<th>类型编号</th>
		</tr>
		<c:forEach items="${list }" var="user">
			<tr>
				<td align="center">${user.userId }</td>
				<td align="center">${user.userName }</td>
				<td align="center">${user.userPass }</td>
				<td align="center"><fmt:formatDate value="${user.userBirthday }" pattern="yyyy-MM-dd" /></td>
				<td align="center">${user.typeId }</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<a href="${pageContext.request.contextPath }/user/list1.action">关联查询</a>
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>账号</th>
			<th>密码</th>
			<th>生日</th>
			<th>类型名称</th>
		</tr>
		<c:forEach items="${list1 }" var="user">
			<tr>
				<td align="center">${user.userId }</td>
				<td align="center">${user.userName }</td>
				<td align="center">${user.userPass }</td>
				<td align="center"><fmt:formatDate value="${user.userBirthday }" pattern="yyyy-MM-dd" /></td>
				<td align="center">${user.type.typeName }</td>
			</tr>
		</c:forEach>
	</table>
	
	<hr />
	<a href="${pageContext.request.contextPath }/user/list2.action">连接查询</a>
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>账号</th>
			<th>密码</th>
			<th>生日</th>
			<th>类型名称</th>
		</tr>
		<c:forEach items="${list2 }" var="user">
			<tr>
				<td align="center">${user.userId }</td>
				<td align="center">${user.userName }</td>
				<td align="center">${user.userPass }</td>
				<td align="center"><fmt:formatDate value="${user.userBirthday }" pattern="yyyy-MM-dd" /></td>
				<td align="center">${user.typeName }</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath }/user/init.action">添加</a>
	<a href="${pageContext.request.contextPath }/user/json.action">json</a>
</body>
</html>