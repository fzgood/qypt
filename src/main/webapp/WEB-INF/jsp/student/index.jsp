<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院学生管理</title>

</head>
<script src="${pageContext.request.contextPath }/style/jquery.js"></script>
<script type="text/javascript">
	function findClass() {
		var departmentId = $("#department").attr("value");
		$.ajax({
			url : "${pageContext.request.contextPath}/student/findClass",
			type : "get",
			timeout : "1000",
			data : {
				departmentId : departmentId
			},
			success : function(data) {
				$("#classId option").remove();
				$("#classId").append("<option value='0'>请选择</option>");
				if (data != 0) {
					for ( var i = 0; i < data.length; i++) {
						var classId = data[i].classId;
						var className = data[i].className;
						$("#classId").append(
								"<option value="+classId+">" + className
										+ "</option>");
					}
				}
			},
			error : function(XMLResponse) {
				alert(XMLResponse.responseText);
			}
		});
	}

	function getId() {
		departmentId = $("#department").val();
		classId = $("#classId").val();
		studentName = $("#studentName").val();
		sex = $("#sex").val();
		phone = $("#phone").val();
		address = $("#address").val();
		url = "${pageContext.request.contextPath}/student/index?departmentId="
				+ departmentId
				+ "&classId="
				+ classId
				+ "&studentName="
				+ studentName;
		//alert(url);
		$("#f1").attr("action", url);
		$("#f1").submit();
	}
</script>
<body>
欢迎您管理员：${user.adminName }
<hr>
	学生信息查询：
	<form id="f1" action="" method="get">
		院系:<select id="department" name="departmentId" onChange="findClass()">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select><br> 班级:<select id="classId" name="classId">
			<option value="0">请选择</option>
		</select> <br> 姓名:<input id="studentName" name="studentName" type="text"
			value=""> <br> <input type="button" value="提交"
			onclick="getId();">
	</form>
	<table width="900px">
		<tr>
			<td>院系</td>
			<td>班级</td>
			<td>学生学号</td>
			<td>学生名字</td>
			<td>性别</td>
			<td>手机</td>
			<td>家庭地址</td>
			<td>入学时间</td>
			<td>编辑</td>
		</tr>
		<c:forEach items="${studentAll}" var="s">
			<tr>
				<td>${s.department.departmentName }</td>
				<td>${s.classes.className }</td>
				<td>${s.studentId }</td>
				<td>${s.studentName }</td>
				<td>${s.sex }</td>
				<td>${s.phone }</td>
				<td>${s.address }</td>
				<td>${s.entranceTime }</td>
				<td><a href="${pageContext.request.contextPath}/student/edit?studentId=${s.studentId }">编辑</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
