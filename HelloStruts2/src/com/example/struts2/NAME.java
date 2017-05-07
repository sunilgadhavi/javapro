package com.example.struts2;

import java.io.Serializable;

public class NAME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9061680256301273733L;
	
	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}

