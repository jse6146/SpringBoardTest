<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.box {
	width: 500px;
	margin: 0 auto;
	text-align: center;
	border: 1px solid black;
	padding-bottom: 50px;
}
</style>
</head>
<body>
	<div class="box">
		<h1>MAIN</h1>
		<c:if test="${loginMember==null }">
			<button type="button" class="btn btn-success btn-md"
				onclick="location.href='loginform'">LOGIN</button>
			<button type="button" class="btn btn-info btn-md"
				onclick="location.href='joinform'">JOIN</button>
		</c:if>
		<c:if test="${loginMember!=null }">
			<span><b>${loginMember.name }</b>님 환영합니다.
			<button type="button" class="btn btn-sm btn-danger">LOGOUT</button></span>
		
		</c:if>
		<br /> <br />
		<button type="button" class="btn btn-warning btn-lg">BOARD</button>
	</div>
</body>
</html>