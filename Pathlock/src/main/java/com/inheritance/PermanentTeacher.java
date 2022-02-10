package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class PermanentTeacher  extends Teacher{
	
	private int salary;

	public PermanentTeacher() {
		super();
	
		
	}

	

	public PermanentTeacher(int salary) {
		super();
		this.salary = salary;
	}



	public PermanentTeacher(int tid, String tname,int salary) {
		super(tid, tname);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentTeacher [salary=" + salary + "]";
	}

	
}