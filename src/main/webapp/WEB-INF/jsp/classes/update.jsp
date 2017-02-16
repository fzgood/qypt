<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院班级信息修改</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/classes/editover" method="get">
		<input type="hidden" name="classId" value="${classes2.classId }">
		<br>
		院系:
		<select name="departmentId">
			<option value="${department.departmentId }">当前院系：${department.departmentName }</option>
			<option>------------</option>
			<option value="1">护理学院</option>
			<option value="2">机电与汽车工程学院</option>
			<option value="3">外语与经贸学院</option>
			<option value="4">信息技术与创意设计学院	</option>
			<option value="5">旅游家政与艺术学院</option>
			<option value="6">食品药品学院</option>
		</select>
		<br>
		班级信息修改：<input name="className" type="text" value="${classes2.className}">
		<br>
		<input name="state" type="radio" value="未毕业" <c:if test="${classes2.state eq '未毕业'}"> checked="checked"</c:if>>未毕业
		<input name="state" type="radio" value="毕业" <c:if test="${classes2.state eq '毕业'}"> checked="checked"</c:if>>毕业
		<br>
		<input type="submit" value="修改完毕" >
	</form>
</body>
</html>
