package com.study.bean;

import java.util.List;

public class StudentBean {

	private Integer studentId;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private List<FamilyBean> families;

	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", studentSex=" + studentSex
				+ ", studentAge=" + studentAge + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public List<FamilyBean> getFamilies() {
		return families;
	}

	public void setFamilies(List<FamilyBean> families) {
		this.families = families;
	}

	
}
