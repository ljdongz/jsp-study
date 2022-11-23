<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%
request.setCharacterEncoding("UTF-8");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC TEST JSP</title>
</head>
<body>
	<div align=center>
		<sql:query var="rs" dataSource="jdbc/mysql"> select username, email from student
</sql:query>
		<h2>결과출력</h2>
		<HR>
		<c:forEach var="row" items="${rs.rows}"> 이름 : ${row.username}<br />
이메일 : ${row.email}
<HR>
		</c:forEach>
	</div>

</body>
</html>