package tw.brad.beans;

public class Member {
	private String account, realname;
	private int age;
	
	public Member() {
		this("","",0);
	}
	public Member(String account, String realname, int age) {
		this.account = account;
		this.realname = realname;
		this.age = age;
	}
	public String getAccount() {
		return this.account;
	}
	public String getRealname() {
		return this.realname;
	}
	public int getAge() {
		return this.age;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	
}
