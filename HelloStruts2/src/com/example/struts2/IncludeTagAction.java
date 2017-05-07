package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class IncludeTagAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6755621028356347777L;
	
	private String incName;

	public String getIncName() {
		return incName;
	}

	public void setIncName(String incName) {
		this.incName = incName;
	}
	
	public String execute() {
		return SUCCESS;
	}

}
