<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/showUser.do?id=${1}">查询用户</a>
</body>
</html>