package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Depatment {
	
	@Id
	private int did;
	private String dname;
	
	public Depatment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depatment(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
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

	@Override
	public String toString() {
		return "Depatment [did=" + did + ", dname=" + dname + "]";
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
		
}