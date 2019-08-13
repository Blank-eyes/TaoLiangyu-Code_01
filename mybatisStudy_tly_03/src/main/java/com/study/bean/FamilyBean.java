package com.study.bean;

public class FamilyBean {

	private Integer fId;
	private String fRelation;
	private String fName;
	private Integer studentId;
	
	@Override
	public String toString() {
		return "FamilyBean [fId=" + fId + ", fRelation=" + fRelation + ", fName=" + fName + ", studentid=" + studentId
				+ "]";
	}

	public FamilyBean() {
		super();
	}

	public FamilyBean(String fRelation, String fName) {
		this.fRelation = fRelation;
		this.fName = fName;
	}

	public Integer getfId() {
		return fId;
	}

	public void setfId(Integer fId) {
		this.fId = fId;
	}

	public String getfRelation() {
		return fRelation;
	}

	public void setfRelation(String fRelation) {
		this.fRelation = fRelation;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
    
	
}
