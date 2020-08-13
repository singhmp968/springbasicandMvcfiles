package com.assign4;

public class student {

	private String studentId;
	private String sname;
	Test studentTest;
	public student(String studentId, String sname, Test studentTest) {
		super();
		this.studentId = studentId;
		this.sname = sname;
		this.studentTest = studentTest;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Test getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(Test studentTest) {
		this.studentTest = studentTest;
	}
	@Override
	public String toString() {
		return this.sname + " " +this.studentId + " : " + this.getStudentTest().getTestId() +" : "+ this.getStudentTest().getTestTitle() + " : "+this.getStudentTest().getTestMarks();
	}
	
	
	
}
