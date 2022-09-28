<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>include_action.jsp에서 footer.jsp를 include</h2>
	<hr>
	include_action.jsp에서 호출할 메세지입니다. <br>
	<jsp:include page="footer.jsp">
	<jsp:param name="email" value="test@tuk.com"/>
	<jsp:param name="tel" value="000-0000-0000"/>
	</jsp:include>
	<p>End</p>
</body>
</html>