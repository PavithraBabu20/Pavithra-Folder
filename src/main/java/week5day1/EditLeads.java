package week5day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;
import week6day1.ProjectMethods;

public class EditLeads extends ProjectMethods {
	@Test(groups= {"Sanity"})
	public void editLead() {
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
		WebElement finLead = locateElement("link","Find Leads");
		click(finLead);
		WebElement enteringFirstName = locateElement("name","firstName");
		type(enteringFirstName, "Akash");
		WebElement findLeadButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton);
		WebElement firstid = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(firstid);
		System.out.println("Clicked on 1st Id");
		WebElement editButton = locateElement("link","Edit");
		click(editButton);
		WebElement editFirstName = locateElement("id","updateLeadForm_firstNameLocal");
		type(editFirstName, "EditingFirstName");
		WebElement editSubmit = locateElement("name","submitButton");
		click(editSubmit);	
}
}
