package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Engineering {
	
	private int ecode;
	private String ecollage;
	private Map<String,String> ecoursename;
	private Set<String> Subject;
	private List<String> Faculty;
	@Autowired
	private Library library;
	public Engineering() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineering(int ecode, String ecollage, Map<String, String> ecoursename, Set<String> subject,
			List<String> faculty, Library library) {
		super();
		this.ecode = ecode;
		this.ecollage = ecollage;
		this.ecoursename = ecoursename;
		Subject = subject;
		Faculty = faculty;
		this.library = library;
	}
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getEcollage() {
		return ecollage;
	}
	public void setEcollage(String ecollage) {
		this.ecollage = ecollage;
	}
	public Map<String, String> getEcoursename() {
		return ecoursename;
	}
	public void setEcoursename(Map<String, String> ecoursename) {
		this.ecoursename = ecoursename;
	}
	public Set<String> getSubject() {
		return Subject;
	}
	public void setSubject(Set<String> subject) {
		Subject = subject;
	}
	public List<String> getFaculty() {
		return Faculty;
	}
	public void setFaculty(List<String> faculty) {
		Faculty = faculty;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "Engineering [ecode=" + ecode + ", ecollage=" + ecollage + ", ecoursename=" + ecoursename + ", Subject="
				+ Subject + ", Faculty=" + Faculty + ", library=" + library + "]";
	}
	
	
	
		}