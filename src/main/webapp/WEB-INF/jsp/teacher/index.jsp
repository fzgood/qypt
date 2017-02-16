<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学老师浏览</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/teacher/add"
		method="get">
		添加老师信息:<select name="departmentId">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select> 请输入老师名称：<input id="teacherName" name="teacherName" type="text" /> <input
			type="submit" value="commit"> ${error }
	</form>
	<form action="${pageContext.request.contextPath}/teacher/index">
		查询老师信息:<select name="departmentId">
			<option value="0">
				请选择
			</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select> 老师名字: <input type="text" name="teacherName" value="${teacherCustom.teacherName }" /> <input
			type="submit" value="查询">
	</form>
	<table width="350px">
		<tr>
			<td>系部名称</td>
			<td>编号</td>
			<td>老师名称</td>
		</tr>
		<c:forEach items="${teacherAll}" var="t">
			<tr>
				<td>${t.department.departmentName }</td>
				<td>${t.teacherId }</td>
				<td>${t.teacherName }</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${teacherCustom.pageCurrrnt ne 1 }">
	<a href="${pageContext.request.contextPath}/teacher/index?departmentId=${teacherCustom.departmentId}&teacherName=${teacherCustom.teacherName}&pageCurrrnt=${teacherCustom.pageCurrrnt-1}">上一页</a>  
	</c:if>
	当前第 ${teacherCustom.pageCurrrnt} 页  
	<c:if test="${teacherCustom.pageCurrrnt ne teacherCustom.pageNum }">
	<a href="${pageContext.request.contextPath}/teacher/index?departmentId=${teacherCustom.departmentId}&teacherName=${teacherCustom.teacherName}&pageCurrrnt=${teacherCustom.pageCurrrnt+1}">下一页</a>
	</c:if>		
</body>
</html>
