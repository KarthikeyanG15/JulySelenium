package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC008_ConvertLead extends OpentapsWrappers {

	@Test(dataProvider="fetchData")
	public void convertLead(String Username, String Password, String City)
	{
		new LoginPage()	
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickCrmfsa()
		.clickLeads()
		.clickFindleads()
		.clickAdvancedTab()
		.enterCityName(City)
		.clickFndLead()
		.clickFirstLead()
		.clickQualifyLeadBtn()
		.clickConvertBtn()
		.clickConvertLeadBtn();
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="ConvertLead";
		browserName="chrome";
		testCaseName="Convert Lead";
		testDescription="Convert Leed using POM framework";
	}

	
}
