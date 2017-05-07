package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class XSLAction extends ActionSupport {

	private static final long serialVersionUID = 2909932185497463072L;
	
	private String code, name, city;
	private double salary;

	@Override
	public void validate() {
		if (code.trim().length() == 0)
			addFieldError("code", "Code cannot be left blank");

		if (name.trim().length() == 0)
			addFieldError("name", "Name cannot be left blank");

		if (city.trim().length() == 0)
			addFieldError("city", "City cannot be left blank");

		if (salary == 0)
			addFieldError("salary", "salary is not valid");
	}

	public String execute() throws Exception {
		if (code.trim().length() != 0) {
			if(!code.trim().equals("123")) {
				return INPUT;
			}
		}	
		return SUCCESS;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
