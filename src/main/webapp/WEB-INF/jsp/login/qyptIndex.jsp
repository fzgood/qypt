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
					<li class="active"><a
						href="${pageContext.request.contextPath}/index">首页</a>
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
					<li><a href="${pageContext.request.contextPath}/student/index">学生信息</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/score/index">学生成绩管理</a>
					</li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


				<h2 class="sub-header">公告栏</h2>

				<ul>
					<li><a>添加新的信息</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
					<li><a>111111111111111</a></li>
				</ul>
			</div>
		</div>

	</div>



	<script type="text/javascript" src="dist/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
	<script src="dist/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
