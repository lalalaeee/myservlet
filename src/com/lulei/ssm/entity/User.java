package com.lulei.ssm.entity;

public class User {
	private int uid;
	private String name;
	private String pwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", pwd=" + pwd + "]";
	}
	public User(int uid, String name, String pwd) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
	}
	public User() {
		super();
	}
	
}
