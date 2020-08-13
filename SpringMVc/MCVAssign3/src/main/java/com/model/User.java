package com.model;

public class User {

	private int science;
	private int maths;
	private int english;
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public User(int science, int maths, int english) {
		super();
		this.science = science;
		this.maths = maths;
		this.english = english;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [science=" + science + ", maths=" + maths + ", english=" + english + "]";
	}
	
	

}
