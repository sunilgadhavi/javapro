package com.example.struts2;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class ChainAction2 extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4151369626842218683L;
	private String chain2;

	public String getChain2() {
		return chain2;
	}

	public void setChain2(String chain2) {
		this.chain2 = chain2;
	}


	// get log4j
	private static final Logger logger = Logger.getLogger(ChainAction2.class);

	public String execute() throws Exception {
		logger.info("In Chain Action");
		setChain2("this is secure page chain 2");
		return SUCCESS;
	}
}
