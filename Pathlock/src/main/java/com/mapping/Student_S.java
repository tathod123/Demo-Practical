package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student_S {
	
	@Id
	private int sid;
	private String sdiv;
	private String sname;
	private String sclass;
	@ManyToMany
	private List<Teacher> tech;

	public Student_S() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_S(int sid, String sdiv, String sname, String sclass, List<Teacher> tech) {
		super();
		this.sid = sid;
		this.sdiv = sdiv;
		this.sname = sname;
		this.sclass = sclass;
		this.tech = tech;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSdiv() {
		return sdiv;
	}

	public void setSdiv(String sdiv) {
		this.sdiv = sdiv;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public List<Teacher> getTech() {
		return tech;
	}

	public void setTech(List<Teacher> tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Student_S [sid=" + sid + ", sdiv=" + sdiv + ", sname=" + sname + ", sclass=" + sclass + ", tech=" + tech
				+ "]";
	}
	
	
	
}
	
	