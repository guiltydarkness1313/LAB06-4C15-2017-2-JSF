package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="navigationCtrl",eager=true)
@RequestScoped
public class NavigationCtrl {

	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String goToPage1(){
		return "page1";
	}
	
	public String showPage(){
		if(pageId==null) {
			return "page2";
		}
		if(pageId.equals("1")) {
			return "page1";
		}else if(pageId.equals("2")) {
			return "page2";
		}else {
			return "page2";
		}
	}
}
