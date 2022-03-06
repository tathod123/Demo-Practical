package com.spring;

public class course {
	
	private String coursename;
	private int courseFees;
	
	
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public course(String coursename, int courseFees) {
		super();
		System.out.println("para of course");
		this.coursename = coursename;
		this.courseFees = courseFees;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public int getCourseFees() {
		return courseFees;
	}


	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}


	@Override
	public String toString() {
		return "course [coursename=" + coursename + ", courseFees=" + courseFees + "]";
	}
	
	

}
