package com.example.struts2;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5049792771926539962L;

	private List<Employee> employees;
	private List<Employee> contractors;
	private List<Employee> customers;

	public String execute() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("George", "Recruitment"));
		employees.add(new Employee("Danielle", "Accounts"));
		employees.add(new Employee("Melissa", "Sales"));
		employees.add(new Employee("Rose", "Admin"));
		contractors = new ArrayList<Employee>();
		contractors.add(new Employee("Mindy", "Database"));
		contractors.add(new Employee("Vanessa", "Network"));
		contractors.add(new Employee("Sunil", "Technology"));
		contractors.add(new Employee("Arul", "Support"));
		customers = new ArrayList<Employee>();
		customers.add(new Employee("Jayesh", "Kulfivala"));
		customers.add(new Employee("Haresh", "Batakavala"));
		customers.add(new Employee("Rupen", "Kelavala"));
		return "success";
	}

	public String actionTagExecute() {
		return SUCCESS;
	}

	public Decider getRecruitmentDecider() {
		return new Decider() {
			public boolean decide(Object element) throws Exception {
				Employee employee = (Employee) element;
				return employee.getDepartment().equals("Recruitment");
			}
		};
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getContractors() {
		return contractors;
	}

	public void setContractors(List<Employee> contractors) {
		this.contractors = contractors;
	}

	public List<Employee> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Employee> customers) {
		this.customers = customers;
	}

}
