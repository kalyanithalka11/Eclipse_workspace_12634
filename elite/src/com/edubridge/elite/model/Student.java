package com.edubridge.elite.model;

public class Student {
	private int studentId;
	private String studentName;
	private long studentMobile;
	
		
	public Student(int studentId, String studentName, long studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
	}


	public Student() {
		super();
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public long getStudentMobile() {
		return studentMobile;
	}


	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ "]";
	}

	
	
	
	
}
