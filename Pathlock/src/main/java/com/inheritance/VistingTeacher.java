package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class VistingTeacher extends Teacher{
       private int hrs,rate;

	public VistingTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VistingTeacher(int tid,String tname,int hrs, int rate) {
		super(tid,tname);
		this.hrs=hrs;
		this.rate=rate;
	}



	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "VistingTeacher [hrs=" + hrs + ", rate=" + rate + "]";
	}
       
       

}