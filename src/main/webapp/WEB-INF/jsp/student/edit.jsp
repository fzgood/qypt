<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院学生信息修改</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/student/editover" method="get">
		<input type="hidden" name="studentId" value="${student.studentId }">
		<br>
		院系:
		<select name="departmentId">
			<option value="${student.department.departmentId }">当前院系：${student.department.departmentName }</option>
			<option>------------</option>
			<option value="1">护理学院</option>
			<option value="2">机电与汽车工程学院</option>
			<option value="3">外语与经贸学院</option>
			<option value="4">信息技术与创意设计学院	</option>
			<option value="5">旅游家政与艺术学院</option>
			<option value="6">食品药品学院</option>
		</select>
		<br>
		<select name="classId">
			<option value="${student.classes.classId }">当前班级：${student.classes.className }</option>
			<option>------------</option>
			<c:forEach items="${classAll}" var="classes">
			<option value="${classes.classId }">${classes.className }</option>
			</c:forEach>
		</select>
		<br>
		学生姓名：<input name="studentName" type="text" value="${student.studentName}">
		<br>
		<input name="sex" type="radio" value="男" <c:if test="${student.sex eq '男'}"> checked="checked"</c:if>>男
		<input name="sex" type="radio" value="女" <c:if test="${student.sex eq '女'}"> checked="checked"</c:if>>女
		<br>
		联系方式:<input name="phone" type="text" value="${student.phone}">
		<br>
		家庭地址:<input name="address" type="text" value="${student.address}">
		<br>
		
		<input type="submit" value="修改完毕" >
	</form>
	
	<img width="200" height="200" alt="" src="${pageContext.request.contextPath}/${student.imgUrl}">
	
</body>
</html>
