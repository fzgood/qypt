<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院系部浏览</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/department/add"
		method="get">
		请输入系部名称：<input name="departmentName" type="text" /> <input
			type="submit" value="commit">
	</form>
	<hr />

	<table>
		<tr>
			<td>编号</td>
			<td>系部名称</td>
		</tr>
		<c:forEach items="${departmentAll}" var="department">
			<tr>
				<td>${department.departmentId }</td>
				<td>${department.departmentName }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
