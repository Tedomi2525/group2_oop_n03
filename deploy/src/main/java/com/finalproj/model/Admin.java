package com.finalproj.model;

import java.time.LocalDate;

public class Admin {
	private String code_admin;
	private String full_name;
	private LocalDate birthday;
	private String email;
	private String gender;
	private String username;
	private String password;
	
	public String getCode_admin() {
		return code_admin;
	}
	public void setCode_admin(String code_admin) {
		this.code_admin = code_admin;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate date) {
		this.birthday = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
