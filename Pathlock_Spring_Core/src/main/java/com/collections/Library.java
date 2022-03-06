package com.collections;

import java.util.List;

public class Library {
	private int lcode;
	private List<String>section;
	
	public Library(int lcode, List<String> section) {
		super();
		this.lcode = lcode;
		this.section = section;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLcode() {
		return lcode;
	}

	public void setLcode(int lcode) {
		this.lcode = lcode;
	}

	public List<String> getSection() {
		return section;
	}

	public void setSection(List<String> section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Library [lcode=" + lcode + ", section=" + section + "]";
	}
	
	
	

}
