package jspbook.ch09;

public class Member {
	private String name;
	private String email;
	
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Member() {
		name = "디폴트";
		email = "default@tukorea.ac.kr";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
