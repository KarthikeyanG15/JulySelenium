package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ConvertLeadPage extends OpentapsWrappers{

	public void CovertLeadPage()
	{
		if(!verifyTextContainsByXpath("//div[@id='sectionHeaderTitle_leads']", "Convert Lead"));
		Reporter.reportStep("This is not  Convert Lead Page", "FAIL");
	}
	
	public void clickConvertLeadBtn()
	{
		clickByXpath("//input[@name='submitButton']");
		//return new ViewContactPage();
	}
	
}

