package com.pathlock.model;

public class Student {
	
	private String fname;
	private String lname;
	private String date;
	private String email;
	private String password;
	private long mobile;
	private String gender;
	private String hobbies;
	private String address;
	private String education;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fname, String lname, String date, String email, String password, long mobile, String gender,
			String hobbies, String address, String education) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.date = date;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
		this.hobbies = hobbies;
		this.address = address;
		this.education = education;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", date=" + date + ", email=" + email + ", password="
				+ password + ", mobile=" + mobile + ", gender=" + gender + ", hobbies=" + hobbies + ", address="
				+ address + ", education=" + education + "]";
	}

	}