<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>测试</title>
</head>
<body>
姓名：${user.username}

<button id="AddUser">新增一个用户</button>

<script src="js/jquery-1.11.0.js"></script>
<script src="js/login.js" type="text/javascript"></script>
<script src="js/tip.js"></script>
</body>
</html>