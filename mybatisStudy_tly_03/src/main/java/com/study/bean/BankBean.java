package com.study.bean;

//���п���Ϣ
public class BankBean {

	// id
	private Integer bankId;
	// ���п�����
	private String bankType;
	// ���п�����
	private int bankNo;
	// ����ѧ��id
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
