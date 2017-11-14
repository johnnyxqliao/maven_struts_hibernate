<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maven Struts Hibernate</title>
</head>
<body>
	Hello
	<s:property value="user.getName" />
	<br>, Welcome！
	<br /> your username and password are:
	<br /> 用户名：
	<s:property value="user.getName" />
	<br /> 密码：
	<s:property value="user.password" />
</body>
</html>