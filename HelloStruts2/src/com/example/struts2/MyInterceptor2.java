package com.example.struts2;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor2 implements Interceptor {

	private static final long serialVersionUID = 4673908847485930749L;

	private static final Logger logger = Logger.getLogger(HelloWorldStruts2.class);

	public String intercept(ActionInvocation actionInv) throws Exception {
		logger.info("MyInterceptor2 Pre-processing");

		String result = actionInv.invoke();
		logger.info("MyInterceptor2 result : " + result);

		logger.info("MyInterceptor2 Post-processing");

		return result;
	}

	public void destroy() {
		logger.info("MyInterceptor2 In DESTROY");
	}

	public void init() {
		logger.info("MyInterceptor2 In INIT");
	}

}