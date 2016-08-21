package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class DuplicateLead extends OpentapsWrappers{
	public DuplicateLead(){
		if(!verifyTitle("Duplicate Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead page", "FAIL");
	}	
	public DuplicateLead enterCompanyName(String data){
		enterById(prop.getProperty("Duplicate.Companyname.id"), data);
		return this;	
	}
	public DuplicateLead enterFirstName(String data){
		enterById(prop.getProperty("Duplicate.Firstname.id"), data);
		return this;	
	}
	public ViewLead clickbyUpdate(){
		clickByName(prop.getProperty("Duplicate.update.name"));
		return new ViewLead();
	}
	
	}

