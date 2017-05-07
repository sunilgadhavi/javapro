package com.example.struts2;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class ChainAction extends ActionSupport {

	private String chain;

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1677231123363474302L;

	// get log4j
	private static final Logger logger = Logger.getLogger(ChainAction.class);

	public String execute() throws Exception {
		logger.info("In Chain Action");
		setChain("this is secure page");
		return SUCCESS;
	}
}
