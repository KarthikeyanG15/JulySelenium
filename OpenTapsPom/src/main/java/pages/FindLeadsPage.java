package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {

	public FindLeadsPage() {
		if (!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}

	public FindLeadsPage enterFNameText(String data) {
		enterByXpath("(//input[@name='firstName'])[3]", data);
		return new FindLeadsPage();
	}
	
	public FindLeadsPage clickFndLead() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return new FindLeadsPage();
	}
	
	public ViewLead clickFirstLead() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		return new ViewLead();
	}
	
	public FindLeadsPage clickemail(){
		clickByLink(prop.getProperty("Findpage.email.Link"));
		return this;
	}
	
	public FindLeadsPage enteremail(String data){
		enterByXpath(prop.getProperty("Findpage.email.Xpath"), data);
		return this;
	}
	public FindLeadsPage getCount(String data) throws InterruptedException{
		Thread.sleep(5000);
		getCountByLinkText(data);
		return this;
	}
	public FindLeadsPage clickAdvancedTab()
	{
		clickByLink("Advanced");
		return this;
		
	}
	

	public FindLeadsPage enterCityName(String data)
	{
	 enterByXpath("//input[@name='city']", data);
	 return this;
	 
	}


	
	
}
