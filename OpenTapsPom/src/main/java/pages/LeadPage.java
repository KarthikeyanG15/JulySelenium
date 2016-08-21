package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadPage extends OpentapsWrappers {

	public LeadPage() {
		if (!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}

	public CreateLeadPage clickCrtLead() {
		clickByXpath(prop.getProperty("LeadPg.CLeads.Xpath"));
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindleads() {
		clickByLink(prop.getProperty("LeadPg.FindLeads.Link"));
		return new FindLeadsPage();
	}
	
	public MergeLead clickMergeleads() {
		clickByLink(prop.getProperty("LeadPg.MergeLeads.Link"));
		return new MergeLead();
	}
	
	
}
