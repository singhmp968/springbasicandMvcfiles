package com.sprinAss3;

public class SetterMessage {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "SetterMessage [message=" + message + "]";
}

}
