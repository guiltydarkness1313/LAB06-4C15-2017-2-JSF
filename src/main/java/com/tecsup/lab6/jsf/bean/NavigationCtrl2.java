package com.tecsup.lab6.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationCtrl2", eager = true)
@RequestScoped
public class NavigationCtrl2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String processPage1 () {
		return "page1";
	}

	public String processPage2 () {
		return "page2";
	}

}
