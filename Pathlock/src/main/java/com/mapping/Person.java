package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int pid;
	private String pname;
	private String plastname;
	private long pnumber;
	@OneToOne
	private IdentityCard IdentityCard;
	
	public Person(int pid, String pname, String plastname, long pnumber, com.mapping.IdentityCard identityCard) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plastname = plastname;
		this.pnumber = pnumber;
		IdentityCard = identityCard;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlastname() {
		return plastname;
	}

	public void setPlastname(String plastname) {
		this.plastname = plastname;
	}

	public long getPnumber() {
		return pnumber;
	}

	public void setPnumber(long pnumber) {
		this.pnumber = pnumber;
	}

	public IdentityCard getIdentityCard() {
		return IdentityCard;
	}

	public void setIdentityCard(IdentityCard identityCard) {
		IdentityCard = identityCard;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", plastname=" + plastname + ", pnumber=" + pnumber
				+ ", IdentityCard=" + IdentityCard + "]";
	}
	
	
	
	
	

	
}