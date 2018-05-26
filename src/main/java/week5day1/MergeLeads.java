package week5day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;
import week6day1.ProjectMethods;

public class MergeLeads extends ProjectMethods{	
	@Test(groups= {"Regression"})
		public void mergeLead() {
			/*startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement userName = locateElement("id","username");
			type(userName, "DemoSalesManager");
			WebElement passWord = locateElement("id", "password");
			type(passWord, "crmsfa");
			WebElement login = locateElement("class", "decorativeSubmit");
			click(login);	*/	
			WebElement crmsfa = locateElement("link","CRM/SFA");
			click(crmsfa);
			WebElement leads = locateElement("link","Leads");
			click(leads);
			WebElement mergeLeads = locateElement("link","Merge Leads");
			click(mergeLeads);
			WebElement fromLead = locateElement("xpath","//img[@src=\"/images/fieldlookup.gif\"]");
			click(fromLead);
			switchToWindow(1);
			

	}

}
