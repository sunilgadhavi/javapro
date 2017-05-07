package com.example.struts2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

public class JSONAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4471828839009136812L;

	private String field = "str";

	private int[] ints = { 10, 20 };

	private List<Integer> integers = new ArrayList<Integer>();

	private Map<String, String> map = new HashMap<String, String>();

	private Map<String, NAME> namemap = new HashMap<String, NAME>();

	private String customName = "custom";

	// transiant field
	private transient String fieldt = "this is transiant";

	//private String fieldNoGetter = "no getter";

	public String execute() {
		integers.add(30);
		integers.add(40);
		map.put("lname", "Galt");
		map.put("fname", "John");

		NAME name = new NAME();
		name.setFname("John");
		name.setLname("Galt");
		namemap.put("person1s", name);
		return SUCCESS;
	}

	public Map<String, NAME> getNamemap() {
		return namemap;
	}

	public List<Integer> getIntegers() {
		return integers;
	}

	public String getField() {
		return field;
	}

	public int[] getInts() {
		return ints;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public String getFieldt() {
		return fieldt;
	}

	@JSON(name = "newName")
	public String getCustomName() {
		return customName;
	}
}