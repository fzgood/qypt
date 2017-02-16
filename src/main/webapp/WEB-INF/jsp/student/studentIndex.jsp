<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<link
	href="${pageContext.request.contextPath}/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/dist/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/dashboard.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/dist/js/ie-emulation-modes-warning.js"></script>
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
				+ departmentId + "&classId=" + classId + "&studentName="
				+ studentName;
		//alert(url);
		$("#f1").attr("action", url);
		$("#f1").submit();
	}
</script>
<title>清远职业技术学院首页</title>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand">清远职业技术学院</a>
			</div>

			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">概况</a>
					</li>
					<li><a href="#">帮助</a>
					</li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search..."></input>
				</form>

			</div>


		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				欢迎您：${user.adminName} <a
					href="${pageContext.request.contextPath}/over">注销</a>
				<ul class="nav nav-sidebar">
					<li><a href="${pageContext.request.contextPath}/index">首页</a>
					</li>
					<li><a
						href="${pageContext.request.contextPath}/department/index">院系部门</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/classes/index">班级信息</a>
					</li>
				</ul>

				<ul class="nav nav-sidebar">
					<li><a href="${pageContext.request.contextPath}/course/index">课程信息</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/teacher/index">老师信息</a>
					</li>
					<li class="active"><a
						href="${pageContext.request.contextPath}/student/index">学生信息</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/score/index">学生成绩管理</a>
					</li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


				<h2 class="sub-header">学生信息</h2> 
				<a href="${pageContext.request.contextPath}/student/photo">添加学生头像</a>
				<form id="f1" action="" method="get">
					学生信息查询： 院系:<select id="department" name="departmentId"
						onChange="findClass()">
						<option value="0">请选择</option>
						<c:forEach items="${departmentAll}" var="d">
							<option value="${d.departmentId}">${d.departmentName}</option>
						</c:forEach>
					</select> 班级:<select id="classId" name="classId">
						<option value="0">请选择</option>
					</select> 姓名:<input id="studentName" name="studentName" type="text" value="">
					<input type="button" value="提交" onclick="getId();">
				</form>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
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
						</thead>
						<tbody>
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
									<td><a
										href="${pageContext.request.contextPath}/student/edit?studentId=${s.studentId }">编辑</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>



	<script type="text/javascript" src="dist/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
	<script src="dist/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
