package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id
	private int did;
	private String dname;
	private String HOD;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String dname, String hOD) {
		super();
		this.did = did;
		this.dname = dname;
		HOD = hOD;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getHOD() {
		return HOD;
	}

	public void setHOD(String hOD) {
		HOD = hOD;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", HOD=" + HOD + "]";
	}
	
	
	
	
	

}
