package com.edureka.javasql2.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class WelcomeAction extends Action {

	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		
		WelcomeModel welcomeModel = (WelcomeModel)form;
		welcomeModel.setWelcomeMessage("Welcome to Struts -");
		
		// Outcome
		// Display the page with a welcome message
		
		String outcome = "welcomePageOutcome";
		
		ActionForward actionForward = mapping.findForward(outcome);
		
		return actionForward;
    }

}
