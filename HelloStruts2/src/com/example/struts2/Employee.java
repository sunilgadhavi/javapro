package com.example.struts2;

public class Employee {

	private String empName;
	private String department;
	private int age;

	public Employee() {

	}

	public Employee(String eName, String dept) {
		this.empName = eName;
		this.department = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
