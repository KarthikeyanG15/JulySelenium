package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	
	
	public EditLead clickEdit(){
		clickByLink(prop.getProperty("ViewLead.Editbutton.Link"));
		return new EditLead();
	}
	
	public ViewLead verifyCompany(String data){
		verifyTextContainsByXpath(prop.getProperty("ViewLead.CompName.Xpath"),data);
		return new ViewLead();
	}
	
	public LeadPage clickDelete(){
		clickByLink(prop.getProperty("ViewLead.Delbutton.Link"));
		return new LeadPage();
	}

	public DuplicateLead clickDuplicate(){
		clickByLink(prop.getProperty("ViewLead.Dupbutton.Link"));
		return new DuplicateLead();
	}

	public FindLeadsPage clickFindLeads(){
		clickByLink(prop.getProperty("LeadPg.FindLeads.Link"));
		return new FindLeadsPage();
	}

	public ViewLead clickQualifyLeadBtn()
	{
		clickByLink("Qualify Lead");
		return this;
	}
	

	public ConvertLeadPage clickConvertBtn()
	{
		clickByLink("Convert Lead");
		return new ConvertLeadPage();
	}
	
}
