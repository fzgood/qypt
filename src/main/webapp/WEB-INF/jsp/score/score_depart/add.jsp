<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>信息技术与设计学院成绩添加</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/scoreinfo/addStudentScore" method="get">
		学生姓名：<input name="studentName" type="text"> ${studentNull}
		<hr>
		温馨提示：0代表0分 -1代表缺考
		<table>
			<c:forEach items="${ciAll}" var="ci">
				<tr>
					<td><input type="hidden" name="ciId" value="${ci.ciId}">${ci.ciName}</td>
					<td><input name="fraction" type="text" value=""></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="添加成绩">
	</form>
</body>
</html>
