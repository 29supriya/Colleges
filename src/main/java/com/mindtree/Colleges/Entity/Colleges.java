package com.mindtree.Colleges.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Colleges {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int clgId;
private String cname;
private int totalStudents;
public Colleges(int clgId, String cname, int totalStudents) {
	super();
	this.clgId = clgId;
	this.cname = cname;
	this.totalStudents = totalStudents;
}
public Colleges() {
	super();
	
}
public int getClgId() {
	return clgId;
}
public void setClgId(int clgId) {
	this.clgId = clgId;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getTotalStudents() {
	return totalStudents;
}
public void setTotalStudents(int totalStudents) {
	this.totalStudents = totalStudents;
}
}

	

