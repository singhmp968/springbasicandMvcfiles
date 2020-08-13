package com.Assign5;

import java.util.List;

public class country {

private String countryId;
private String countryname;
public country() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCountryId() {
	return countryId;
}
public void setCountryId(String countryId) {
	this.countryId = countryId;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
@Override
public String toString() {
	return "country [countryId=" + countryId + ", countryname=" + countryname + "]";
}



}
