package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	
	@Id
	private int tid;
	private String tname;
	private String core_subject;
	@ManyToMany
	private List<Student_S> Std;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int tid, String tname, String core_subject) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.core_subject = core_subject;
	}




	public Teacher(int tid, String tname, String core_subject, List<Student_S> std) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.core_subject = core_subject;
		Std = std;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCore_subject() {
		return core_subject;
	}

	public void setCore_subject(String core_subject) {
		this.core_subject = core_subject;
	}

	public List<Student_S> getStd() {
		return Std;
	}

	public void setStd(List<Student_S> std) {
		Std = std;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", core_subject=" + core_subject + ", Std=" + Std + "]";
	}
	
	
	
	
}