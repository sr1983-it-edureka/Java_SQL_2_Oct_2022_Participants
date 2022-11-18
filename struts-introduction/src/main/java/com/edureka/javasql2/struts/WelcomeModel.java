package com.edureka.javasql2.struts;

import org.apache.struts.action.ActionForm;

public class WelcomeModel extends ActionForm {

	private String welcomeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
		
}
