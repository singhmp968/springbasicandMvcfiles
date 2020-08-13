package com.springcore.ci;

/**
 * @author Admin
 *
 */
public class person {

	private String name;
	private int personId;
	private Certi certi;
	public person(String name, int personId,Certi certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return this.name+ " : " + this.personId + " : "+ this.certi.name;
	}
	
	
}
