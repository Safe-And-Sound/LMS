<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加</h2>
	<form action="${pageContext.request.contextPath }/user/add.action">
		<p>账号:<input type="text" name="userName" /></p>
		<p>密码:<input type="password" name="userPass" /></p>
		<p>生日:<input type="date" name="userBirthday" /></p>
		<p>类型:
			<select name="typeId">
				<option value="">--请选择--</option>
				<c:forEach items="${types }" var="type">
					<option value="${type.typeId }">${type.typeName }</option>
				</c:forEach>
			</select>
		</p>
		<p><input type="submit" value="确认" /></p>
	</form>
</body>
</html>