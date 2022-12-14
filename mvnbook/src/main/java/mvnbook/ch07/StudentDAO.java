package mvnbook.ch07;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public ArrayList<StudentVO> getStudentList() {
		connect();
		ArrayList<StudentVO> studentlist = new ArrayList<StudentVO>();
		String sql = "select * from student";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setId(rs.getString("id"));
				student.setPasswd(rs.getString("passwd"));
				student.setUsername(rs.getString("username"));
				student.setSnum(rs.getString("snum"));
				student.setDepart(rs.getString("depart"));
				student.setMobile(rs.getString("mobile"));
				student.setEmail(rs.getString("email"));
				studentlist.add(student);
				System.out.println(studentlist);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return studentlist;
	}
	
	private void connect() {
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost/jspdb?allowPublicKeyRetrieval=true&useUnicode=true&characterEncodi ng=utf8&useSSL=false&serverTimezone=UTC";
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "jspbook", "wjdehd3985");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private void disconnect() {
		try {
			conn.close();
			pstmt.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
