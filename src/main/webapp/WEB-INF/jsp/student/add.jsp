<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>清远职业技术学院学生信息添加</title>
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
		url = "${pageContext.request.contextPath}/student/addStudent?departmentId=" 
				+ departmentId + "&classId=" + classId
				+ "&studentName=" + studentName + "&sex=" + sex + "&phone="
				+ phone + "&address=" + address;
		//alert(url);
		$("#f1").attr("action", url);
		$("#f1").submit();
	}
</script>
<body>
	学生信息添加
	<hr>
	<form id="f1" action="" method="get">
		院系:<select id="department" name="departmentId" onChange="findClass()">
			<option value="0">请选择</option>
			<c:forEach items="${departmentAll}" var="d">
				<option value="${d.departmentId}">${d.departmentName}</option>
			</c:forEach>
		</select><br> 班级:<select id="classId" name="classId">
			<option value="0">请选择</option>
		</select> <br> 姓名:<input id="studentName" name="studentName" type="text" value=""> <br>
		性别:<input id="sex" name="sex" type="radio" value="男"> 男 <input
			id="sex" name="sex" type="radio" value="女"> 女 <br> 
			手机:<input name="phone"	id="phone" type="text" value=""> <br> 
			家庭地址:<input name="address"
			id="address" type="text" value=""> <br> 
			 <input type="button" value="提交" onclick="getId();">
	</form>

</body>
</html>
