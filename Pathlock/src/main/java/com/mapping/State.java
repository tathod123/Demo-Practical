package com.mapping;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class State {
	@Id
	private int scode;
	private String spin;
	private String sname;
	@ManyToOne
	private Country country;
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(int scode, String spin, String sname, Country country) {
		super();
		this.scode = scode;
		this.spin = spin;
		this.sname = sname;
		this.country = country;
	}


	

	public int getScode() {
		return scode;
	}


	public void setScode(int scode) {
		this.scode = scode;
	}


	public String getSpin() {
		return spin;
	}


	public void setSpin(String spin) {
		this.spin = spin;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "State [scode=" + scode + ", spin=" + spin + ", sname=" + sname + ", country=" + country + "]";
	}
	
	
}