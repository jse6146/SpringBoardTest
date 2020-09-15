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
	<form action="login" method="post">
		<table style="margin: 50px auto 0;">
		<caption>LOGIN</caption>
			<tr style="padding-bottom: 20px">
				<th>ID</th>
				<td><input type="text" name="id" style="width: 250px;"
					class="form-control"></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="password" name="pass" style="width: 250px;"
					class="form-control"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit" class="btn btn-success">LOGIN</button>
					<button type="button" class="btn btn-info" onclick="location.href='joinform'">JOIN</button>
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>