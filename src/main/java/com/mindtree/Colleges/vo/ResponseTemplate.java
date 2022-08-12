package com.mindtree.Colleges.vo;

import java.util.List;

import com.mindtree.Colleges.Entity.Colleges;

public class ResponseTemplate {

	private Colleges college;
	private List<Students> students;
	public ResponseTemplate() {
		super();
		
	}
	public Colleges getCollege() {
		return college;
	}
	public void setCollege(Colleges college) {
		this.college = college;
	}
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	public ResponseTemplate(Colleges college, List<Students> students) {
		super();
		this.college = college;
		this.students = students;
	}
	

}




