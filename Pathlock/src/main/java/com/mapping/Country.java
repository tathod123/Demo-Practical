package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	private int ccode;
	private String cpin;
	private String cname;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int ccode, String cpin, String cname) {
		super();
		this.ccode = ccode;
		this.cpin = cpin;
		this.cname = cname;
	}

	public int getCcode() {
		return ccode;
	}

	public void setCcode(int ccode) {
		this.ccode = ccode;
	}

	public String getCpin() {
		return cpin;
	}

	public void setCpin(String cpin) {
		this.cpin = cpin;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Country [ccode=" + ccode + ", cpin=" + cpin + ", cname=" + cname + "]";
	}
	
	
	

}
