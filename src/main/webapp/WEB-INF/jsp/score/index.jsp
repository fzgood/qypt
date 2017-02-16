<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院成绩管理</title>


</head>

<body>
	<form action="${pageContext.request.contextPath}/score/add">
		添加新的学生成绩记录表:<input name="scoreName" type="text" value=""> <input
			type="submit" value="添加"> 友情提示：格式如 2016-2017-1 或 2016-2017-2 (1:上半年;2:下半年)
	</form>
	<hr>
	<table width="1200px">
		<tr>
			<td>序号</td>
			<td>成绩日期</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>编辑</td>
		</tr>
		<c:forEach items="${scoreAll }" var="score">
			<tr id="">
				<td>${score.scoreId }</td>
				<td>${score.scoreName}</td>
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=1&scoreId=${score.scoreId }">护理学院</a></td>
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=2&scoreId=${score.scoreId }">机电与汽车工程学院</a></td>
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=3&scoreId=${score.scoreId }">外语与经贸学院</a></td>
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=4&scoreId=${score.scoreId }">信息技术与创意设计学院</a></td>
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=5&scoreId=${score.scoreId }">旅游家政与艺术学院</a></td>				
				<td><a href="${pageContext.request.contextPath}/score/goscoreinfo?departmentId=6&scoreId=${score.scoreId }">食品药品学院</a></td>
				<td><a href="${pageContext.request.contextPath}/score/edit?scoreId=${score.scoreId }">修改名字</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
