<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%
request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>테이블 student에서 이름으로 조회하는 프로그래밍</h2>
		<hr>
		<h2>학생 정보 조회</h2>
		<br>
		<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost/jspdb?allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
		String sql = "select * from student where username like ?";
		String name = request.getParameter("username") + "%";
		int rowCount = 0;
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "jspbook", "wjdehd3985");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet result = pstmt.executeQuery();
		%>
		<table width=100% border=1 cellpadding=1>
			<tr>
				<td align="center"><b>아이디</b></td>
				<td align="center"><b>암호</b></td>
				<td align="center"><b>이름</b></td>
				<td align="center"><b>학번</b></td>
				<td align="center"><b>학과</b></td>
				<td align="center"><b>휴대폰</b></td>
				<td align="center"><b>이메일</b></td>
			</tr>
		<%
			while (result.next()) {
		%>
			<tr>
				<td align="center"><%= result.getString(1) %></td>
				<td align="center"><%= result.getString(2) %></td>
				<td align="center"><%= result.getString(3) %></td>
				<td align="center"><%= result.getString(4) %></td>
				<td align="center"><%= result.getString(5) %></td>
				<td align="center"><%= result.getString(6) %></td>
				<td align="center"><%= result.getString(7) %></td>
			</tr>
		<%
				rowCount++;
			}
			result.close();
		}catch(Exception e){
			out.println("Mysql : student 테이블 조회에 문제가 발생");
			out.println(e.toString());
			e.printStackTrace();
		}finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		%>
		</table>
	</div>
	<p><hr>
	<font color=blue>
	<%
		if (rowCount == 0)
			out.println("조회된 결과가 없습니다.");
		else
			out.println("조회된 결과가 " + rowCount + "건 입니다.");
	%>
	</font>
</body>
</html>