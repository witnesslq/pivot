package com.edoyun.pivot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		if (logger.isDebugEnabled()) {
			logger.debug("slf4j-log4j debug message");
		}
		if (logger.isInfoEnabled()) {
			logger.info("slf4j-log4j info message");
		}
		if (logger.isTraceEnabled()) {
			logger.trace("slf4j-log4j trace message");
		}
	}
}
