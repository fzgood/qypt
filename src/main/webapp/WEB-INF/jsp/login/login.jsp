<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
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
<link href="${pageContext.request.contextPath}/css/signin.css"
	rel="stylesheet">
<script src="dist/js/ie-emulation-modes-warning.js"></script>

<title>清远职业技术学院后台登录</title>
</head>

<body>
	<div class="container">
		<form action="${pageContext.request.contextPath}/verification"
			method="post" class="form-signin" role="form">
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="text" name="adminName" class="form-control"
				placeholder="Usernaem address" required autofocus="autofocus">
			<input type="password" name="adminPass" class="form-control"
				placeholder="Password" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					记住账号	 </label> ${noUserAndPass}
			</div>

			<input type="submit" class="btn btn-lg btn-primary btn-block"
				value="Sign in">
		</form>
	</div>



	<script type="text/javascript" src="dist/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
	<script src="dist/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
