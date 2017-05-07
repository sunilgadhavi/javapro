package com.example.struts2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;

//import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldStruts2 extends ActionSupport {

	// get log4j
	private static final Logger logger = Logger.getLogger(HelloWorldStruts2.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 6596066405079626346L;

	private String name;
	private int age;

	private ArrayList<Integer> days;

	private Date currentDate;

	public String execute() throws Exception {
		if ("SECRET".equals(name)) {
			logger.info("HelloWorldStruts2 - " + SUCCESS);
			return SUCCESS;
		} else {
			logger.info("HelloWorldStruts2 - " + ERROR);
			return ERROR;
		}
	}
	
	public String textTagExecute(){
		return SUCCESS;
	}
	
	public String urlTagExecute(){
		return SUCCESS;
	}

	@SuppressWarnings("deprecation")
	public String valueStackMethod() {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("value1", new String("First value"));
		context.put("value2", new String("Second value"));
		stack.push(context);
		String mySessionObject = "SessionObject";
		ActionContext.getContext().getSession().put("mySessionPropKey", mySessionObject);
		days = new ArrayList<Integer>();
		for (int i = 0; i < 50; i += 5) {
			days.add(i);
		}
		Date d = new Date();
		d.setYear(116);
		d.setMonth(11);
		setCurrentDate(d);
		return SUCCESS;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Integer> getDays() {
		return days;
	}

}