package com.mycompany.app;

public class NameNumber {
	private String lastName;
	private String telName;
	public NameNumber(String name, String num) {
		lastName = name;
		telName = num;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getTelName() {
		return telName;
	}
}
