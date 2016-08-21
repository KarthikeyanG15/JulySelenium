package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String FindName) {

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
		.clickDelete();

		
		
		
		
		/*.clickCrtLead()
		.enterCompanyName(CName)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLead();
*/

	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="chrome";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
