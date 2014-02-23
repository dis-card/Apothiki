<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common.jsp"%>
<title>Apothiki</title>
</head>
<body>
	<f:view>
		<%@include file="/header.jsp"%>
		<p>Welcome ${sessionScope.username}</p>
		<%@include file="/menu.jsp"%>
	<%@include file="/footer.jsp"%>
	</f:view>
</body>
</html>