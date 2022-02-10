package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
	@Id
	private int empid;
	private String ename;
	private String elastname;
	@ManyToOne
	private Dept dept;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empid, String ename, String elastname, Dept dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.elastname = elastname;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getElastname() {
		return elastname;
	}

	public void setElastname(String elastname) {
		this.elastname = elastname;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", elastname=" + elastname + ", dept=" + dept + "]";
	}
	
	
	
}