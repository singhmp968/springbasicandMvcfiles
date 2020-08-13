package com.Model;

public class movieModel {
String moviName;

public String getMoviName() {
	return moviName;
}

public void setMoviName(String moviName) {
	this.moviName = moviName;
}



public movieModel(String moviName) {
	super();
	this.moviName = moviName;
}

public movieModel() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "movieModel [moviName=" + moviName + "]";
}

}
