package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MergeLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC008_Duplicate extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String email) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmfsa()
		.clickLeads()
		.clickFindleads()
		.clickemail()
		.enteremail(email)
		.getCount(email)
		.clickFndLead()
		.clickFirstLead()
		.clickDuplicate()
		.clickbyUpdate()
		.clickFindLeads()
		.clickemail()
		.enteremail(email)
		.clickFndLead()
		.getCount(email);
		
	



	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Duplicate";
		browserName="chrome";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
