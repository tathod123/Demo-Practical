package com.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="stud")
public class Student_ss {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
    @Column(name="StudentName",nullable=false)
	private String sname;
    @Column(name="StudentCollage")
	private String collage;
	private String Department;
	
	
	public Student_ss() {
		super();
		
	}
	public Student_ss(int sid, String sname, String collage, String department) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.collage = collage;
		Department = department;
	}

	public Student_ss(String sname, String collage, String department) {
		super();
		this.sname = sname;
		this.collage = collage;
		Department = department;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCollage() {
		return collage;
	}


	public void setCollage(String collage) {
		this.collage = collage;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", collage=" + collage + ", Department=" + Department + "]";
	}
	
	
	
	
	

}
