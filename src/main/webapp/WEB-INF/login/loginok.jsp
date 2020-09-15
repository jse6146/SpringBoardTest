<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<br/>
		<h4>${loginMember.name}님이 로그인 중입니다.</h4>
		<button type="button" class="btn btn-basic" onclick="location.href='main'">메인으로</button>
	</div>
</body>
</html>