package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String FindName, String CompName) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmfsa()
		.clickLeads()
		.clickFindleads()
		.enterFNameText(FindName)
		.clickFndLead()
		.clickFirstLead()
		.clickEdit()
		.updateCompany(CompName)
		.clickUpdatebutton()
		.verifyCompany(CompName);

		
		
		
		
		/*.clickCrtLead()
		.enterCompanyName(CName)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLead();
*/

	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="firefox";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
