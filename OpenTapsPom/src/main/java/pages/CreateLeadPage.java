package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {

	public CreateLeadPage() {
		if (!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}

	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLead.CompName.Id"), data);
		return this;
		
	}
	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLead.FName.Id"), data);
		return this;
		
	}
	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLead.LName.Id"), data);
		return this;
		
	}
	public ViewLead clickCreateLead() {
		clickByClassName(prop.getProperty("CreateLead.CreateButton.Class"));
		return new ViewLead();
	}

}
