package com.cake.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cake {
	
	@Id
	private int cakeid;
	private String cakename;
	private double cakeprice;
	private double cakeweight;
	private String cakecategory;
	
	
	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cake(int cakeid, String cakename, double cakeprice, double cakeweight, String cakecategory) {
		super();
		this.cakeid = cakeid;
		this.cakename = cakename;
		this.cakeprice = cakeprice;
		this.cakeweight = cakeweight;
		this.cakecategory = cakecategory;
	}


	public int getCakeid() {
		return cakeid;
	}


	public void setCakeid(int cakeid) {
		this.cakeid = cakeid;
	}


	public String getCakename() {
		return cakename;
	}


	public void setCakename(String cakename) {
		this.cakename = cakename;
	}


	public double getCakeprice() {
		return cakeprice;
	}


	public void setCakeprice(double cakeprice) {
		this.cakeprice = cakeprice;
	}


	public double getCakeweight() {
		return cakeweight;
	}


	public void setCakeweight(double cakeweight) {
		this.cakeweight = cakeweight;
	}


	public String getCakecategory() {
		return cakecategory;
	}


	public void setCakecategory(String cakecategory) {
		this.cakecategory = cakecategory;
	}


	@Override
	public String toString() {
		return "Cake [cakeid=" + cakeid + ", cakename=" + cakename + ", cakeprice=" + cakeprice + ", cakeweight="
				+ cakeweight + ", cakecategory=" + cakecategory + "]";
	}
	
	

}
