package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String CName, String FName, String LName) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmfsa()
		.clickLeads()
		.clickCrtLead()
		.enterCompanyName(CName)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLead();


	}

	@BeforeClass
	//@Parameters("browser")
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="firefox";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
