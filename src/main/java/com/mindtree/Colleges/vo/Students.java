package com.mindtree.Colleges.vo;

public class Students {

	private int rollNo;
	private String sname;
	private String gender;
	private int age;
	private int clgId;
	public Students() {
		super();
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public Students(int rollNo, String sname, String gender, int age, int clgId) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.gender = gender;
		this.age = age;
		this.clgId = clgId;
	}
	}



