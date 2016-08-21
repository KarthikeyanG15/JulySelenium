package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MergeLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String MName1, String MName2) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmfsa()
		.clickLeads()
		.clickMergeleads()
		.clickFromLead()
		.enterFNameText(MName1)
		.clickFndLead()
		.clickFLead()
		.clickToLead()
		.enterLNameText(MName2)
		.clickFndLead()
		.clickFLead()
		.clickMergeButton();


	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007";
		browserName="firefox";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
