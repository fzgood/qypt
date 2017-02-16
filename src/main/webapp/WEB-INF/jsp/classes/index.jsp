<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院班级信息</title>
</head>

<body>
	<form action="${pageContext.request.contextPath }/classes/add"
		method="get">
		<select name="departmentId">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select> <input type="text" name="className"> <input type="submit"
			value="commit">
	</form>
	<hr>
	<form action="${pageContext.request.contextPath }/classes/index"
		method="get">
		查询班级信息：<select name="departmentId">
			<option value="0">所有部门</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select> <input type="text" name="className"
			value="${classesCustom.className}"> <input type="submit"
			value="查询">
	</form>
	<table width="500px">
		<tr>
			<td>院系名</td>
			<td>班级名</td>
			<td>是否毕业</td>
			<td>编辑</td>
		</tr>
		<c:forEach items="${classesAll}" var="classesAll">
			<tr>
				<td>${classesAll.department.departmentName}</td>
				<td>${classesAll.className}</td>
				<td>${classesAll.state}</td>
				<td><a
					href="${pageContext.request.contextPath}/classes/update?classId=${classesAll.classId}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${classesCustom.pageCurrent ne 1 }">
		<a
			href="${pageContext.request.contextPath}/classes/index?departmentId=${classesCustom.departmentId}&className=${ClassesCustom.classesName}&pageCurrent=${classesCustom.pageCurrent-1}">上一页</a>
	</c:if>
	当前第${classesCustom.pageCurrent}页
	<c:if test="${classesCustom.pageCurrent ne classesCustom.pageNum }">
		<a
			href="${pageContext.request.contextPath}/classes/index?departmentId=${classesCustom.departmentId}&className=${ClassesCustom.classesName}&pageCurrent=${classesCustom.pageCurrent+1}">下一页</a>
	</c:if>
</body>
</html>
