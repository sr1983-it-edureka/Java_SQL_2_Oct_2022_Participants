package com.edureka.javasql2.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{

	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    	LoginModel loginModel = (LoginModel)form;
    	
    	// loginSuccessOutcome | loginFailureOutcome
    	String outcome = "";
    	
    	String username = loginModel.getUsername();
    	String password = loginModel.getPassword();
    	
    	if (username != null && username.equals("admin")
    		&& password != null && password.equals("admin")) {
    	
    		outcome = "loginSuccessOutcome";
    	}else {
    		outcome = "loginFailureOutcome";
    	}
    	
    	ActionForward forward = mapping.findForward(outcome);
    	return forward;
    }

}
