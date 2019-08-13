package com.study.bean;

//银行卡信息
public class BankBean {

	// id
	private Integer bankId;
	// 银行卡类型
	private String bankType;
	// 银行卡卡号
	private int bankNo;
	// 所属学生id
	private Integer studentId;

	@Override
	public String toString() {
		return "BankBean [bankId=" + bankId + ", bankType=" + bankType + ", bankNo=" + bankNo + ", studentId="
				+ studentId + "]";
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public int getBankNo() {
		return bankNo;
	}

	public void setBankNo(int bankNo) {
		this.bankNo = bankNo;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

}
