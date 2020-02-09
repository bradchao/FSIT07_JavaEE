package tw.brad.javaee;

public class Member {
	private String account, realname;
	private int age;
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
	public void addAge() {
		age++;
	}
}

