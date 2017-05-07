package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {

	private static final long serialVersionUID = -8067722993794778993L;

	private Employee emp;

	public String execute() {
		return SUCCESS;
	}

	public void validate() {
		System.out.println(emp.getEmpName() +" - " + emp.getAge());
		if (emp.getEmpName() == null || emp.getEmpName().trim().equals("")) {
			addFieldError("emp.empName", "The name is required");
		}
		if (emp.getAge() < 28 || emp.getAge() > 65) {
			addFieldError("emp.age", "Age must be in between 28 and 65");
		}
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}