package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld",eager=true)
public class HelloWorld {

	private String message="Hello World";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
