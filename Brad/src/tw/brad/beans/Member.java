package tw.brad.beans;

import java.io.Serializable;

public class Member {
	private String account, realname;
	private int age;
	
	public Member() {
		this("","",0);
	}
	private Member(String account, String realname, int age) {
		this.account = account;
		this.realname = realname;
		this.age = age;
	}
	
	// getter & setter
	public String getAccount() {
		return " ==> " + this.account;
	}
	public String getRealname() {
		return this.realname;
	}
	public int getAge() {
		return this.age;
	}
	public void setAccount(String account) {
		this.account = "***" + account;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return realname + "(" + age + ")";
	}
	
}
