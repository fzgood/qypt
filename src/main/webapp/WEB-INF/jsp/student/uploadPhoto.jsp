<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生相片上传</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/upload/studentPhoto" method="post" enctype="multipart/form-data">
		输入学生学号:<input name="studentId" type="text" value=""><br>
		File to upload:<input type="file" name="photo"><br />
		<button id="submit1" type="submit" value="submit">提交</button>
	</form>
	
	${name}
</body>
</html>
