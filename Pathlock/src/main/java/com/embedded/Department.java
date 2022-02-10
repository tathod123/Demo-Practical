package com.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Department {

	private int DeptId;
	private String DeptName;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String deptName) {
		super();
		DeptId = deptId;
		DeptName = deptName;
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Override
	public String toString() {
		return "Depatment [DeptId=" + DeptId + ", DeptName=" + DeptName + "]";
	}

}
