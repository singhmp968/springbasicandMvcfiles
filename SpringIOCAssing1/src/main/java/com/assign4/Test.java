package com.assign4;

public class Test {
private String testId;
private String testTitle;
private int testMarks;
public Test(String testId, String testTitle, int testMarks) {
	super();
	this.testId = testId;
	this.testTitle = testTitle;
	this.testMarks = testMarks;
}
public String getTestId() {
	return testId;
}
public void setTestId(String testId) {
	this.testId = testId;
}
public String getTestTitle() {
	return testTitle;
}
public void setTestTitle(String testTitle) {
	this.testTitle = testTitle;
}
public int getTestMarks() {
	return testMarks;
}
public void setTestMarks(int testMarks) {
	this.testMarks = testMarks;
}
public Test() {
	super();
	// TODO Auto-generated constructor stub
}

}
