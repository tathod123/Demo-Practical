package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student implements InitializingBean,DisposableBean{
	//life cyle method
	//init(),& Destroy();3 way we can achieve
	//1 xml file
	//2 implement interface
	//3 Annotationbase
	private int sid;
	private String sname;
	private int percent;
	//@Autowired
	private course course;

	public course getCourse() {
		return course;
	}
    // @Autowired
    // @Qualifier
	public void setCourse(course course) {
		this.course = course;
	}

	public Student(int sid, String sname, int percent, com.spring.course course) {
		super();
		System.out.println("call me");
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.course = course;
	}

	public Student() {
		super();
		System.out.println("bject create");

		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int percent) {
		super();
		System.out.println("parameterzed constru");
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		System.out.println("setter method invoked");
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", course=" + course + "]";
	}
	public void destroy() throws Exception {
		System.out.println("Destroy call");
		//it is call before destroy the object
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("init call");
		//it is call after setter method call
		
	}
	
}
	


