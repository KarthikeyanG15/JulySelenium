package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLead extends OpentapsWrappers {

	public EditLead() {
		if (!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}

	public EditLead updateCompany(String data) {
		enterById(prop.getProperty("EditPg.CompanyName.Id"), data);
		return new EditLead();
	}

	public ViewLead clickUpdatebutton(){
		clickByName(prop.getProperty("EditPg.UpdateButton.Name"));
		return new ViewLead();
	}

}
