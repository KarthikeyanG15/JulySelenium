package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeSecWin extends OpentapsWrappers {

	public MergeSecWin() {
		if (!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}
	
	public MergeSecWin enterFNameText(String data) {
		enterByXpath("(//input[@name='firstName'])", data);
		return new MergeSecWin();
	}
	
	public MergeSecWin enterLNameText(String data) {
		enterByXpath("(//input[@name='firstName'])", data);
		return new MergeSecWin();
	}
	
	public MergeSecWin clickFndLead() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return new MergeSecWin();
	}
	
	public MergeLead clickFLead() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpathWPreSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		driver.switchTo().window(primaryWindowHandle);
		return new MergeLead();
	}
	
	
}
