package pages;

import java.util.Set;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLead extends OpentapsWrappers {

	public MergeLead() {
		if (!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}
	
	public MergeSecWin clickFromLead(){
		clickByXpath(prop.getProperty("MLeads.FromLeadImg.Xpath"));
		Set<String> winAll=driver.getWindowHandles();
		for (String winAllNum : winAll) {
			driver.switchTo().window(winAllNum);
		}
		return new MergeSecWin();
	}
	
	public MergeSecWin clickToLead(){
		clickByXpath(prop.getProperty("MLeads.ToLeadImg.Xpath"));
		Set<String> winAll=driver.getWindowHandles();
		for (String winAllNum : winAll) {
			driver.switchTo().window(winAllNum);
		}return new MergeSecWin();
	}
	
	public ViewLead clickMergeButton(){
		
		try {
		//	driver.switchTo().window(primaryWindowHandle);
			clickByClassNameWPreSnap("buttonDangerous");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		
		return new ViewLead();
	}
	
}
