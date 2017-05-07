package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class SystemDetails extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3828491955670555262L;

	private Environment env = new Environment("DEV");

	private String operatingSystem = "Windows 10";
	
	public String execute() {
		return SUCCESS;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
