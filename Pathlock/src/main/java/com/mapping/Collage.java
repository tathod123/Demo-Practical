package com.mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Collage {
	@Id
	private int cid;
	private String cname;
	private String caddress;
	@OneToMany//(mappedBy="clg", cascade =CascadeType.ALL)//PERSIST
	private List<Depatment> deptlist;
	
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Collage(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}


	public Collage(int cid, String cname, String caddress, List<Depatment> deptlist) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.deptlist = deptlist;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public List<Depatment> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Depatment> deptlist) {
		this.deptlist = deptlist;
	}

	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", deptlist=" + deptlist + "]";
	}
	
	
}