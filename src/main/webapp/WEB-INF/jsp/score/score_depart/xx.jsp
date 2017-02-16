<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>信息技术与创意设计学院</title>


</head>

<body>
	<a href="${pageContext.request.contextPath}/scoreinfo/add?departmentId=4">添加学生信息</a>
	<hr>
	<table width="800px">
		<tr>
			<td>班级</td>
			<td>姓名</td>
			<td>linux</td>
			<td>php</td>
			<td>java</td>
			<td>jquery</td>
			<td>网络营销</td>
			<td>黑客攻防</td>
			<td>编辑</td>
		</tr>
		<c:forEach items="${scoreInfoAll}" var="score">
			<tr>
				<td>${score.classes.className}</td>
				<td>${score.student.studentName}</td>
				<td>${score.linux}</td>
				<td>${score.php}</td>
				<td>${score.java}</td>
				<td>${score.jquery}</td>
				<td>${score.wlyx}</td>
				<td>${score.hkgf}</td>
				<td><a
					href="${pageContext.request.contextPath}/score/update?studentId=${score.student.studentId}&scoreId=${score.scoreId}">修改成绩</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
