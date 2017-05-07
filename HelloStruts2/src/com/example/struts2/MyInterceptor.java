package com.example.struts2;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	private static final long serialVersionUID = 4673908847485930749L;

	private static final Logger logger = Logger.getLogger(HelloWorldStruts2.class);

	public String intercept(ActionInvocation actionInv) throws Exception {
		logger.info("Pre-processing");

		String result = "failed";
		if (!actionInv.isExecuted()) {
			result = actionInv.invoke();
		}
		logger.info("result : " + result);

		logger.info("Post-processing");

		return result;
	}

	public void destroy() {
		logger.info("In DESTROY");
	}

	public void init() {
		logger.info("In INIT");
	}

}