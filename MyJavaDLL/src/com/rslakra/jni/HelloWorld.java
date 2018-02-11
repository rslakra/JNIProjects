package com.rslakra.jni;

/**
 * 
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
 * @author Rohtash Singh Lakra (rohtash.singh@gmail.com)
 * @created 2018-02-10 03:53:52 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class HelloWorld {
	private String name;

	/**
	 * 
	 * @param name
	 */
	public HelloWorld(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String sayHello() {
		return ("Hello " + name);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// DOMConfigurator.configure("log4j.xml");
		// Logger log = Logger.getLogger(HelloWorld.class);
		HelloWorld helloWorld = new HelloWorld("Rohtash Singh Lakra");
		// log.info(helloWorld);
		helloWorld.sayHello();

	}
}