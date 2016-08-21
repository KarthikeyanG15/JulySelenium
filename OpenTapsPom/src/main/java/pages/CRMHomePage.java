package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public LeadPage clickLeads(){
		clickByLink(prop.getProperty("CrmHome.Leads.Link"));
		return new LeadPage();
	}

	














}
