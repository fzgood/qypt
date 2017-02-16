<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院系部浏览</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/course/add"
		method="get">
		添加课程信息:<select name="departmentId">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select> 请输入课程名称：<input  name="ciName" type="text" /> <input
			type="submit" value="commit">
	</form>
	<hr />
	<form action="">
		添加课程信息:<select name="departmentId">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select>
		<input type="submit" value="查询">
	</form>
	<table width="400px">
		<tr>
			<td>系部名称</td>
			<td>课程名称</td>
		</tr>
		<c:forEach items="${CIAll}" var="CIAll">
			<tr>
				<td>${CIAll.department.departmentName }</td>
				<td>${CIAll.ciName }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
