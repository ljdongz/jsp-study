<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>처리중 문제 발생</h2>
		<table>
			<tr bgcolor="pink">
				<td>
				관리자에게 문의해주세요.
				<HR>
				<%= exception %>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>