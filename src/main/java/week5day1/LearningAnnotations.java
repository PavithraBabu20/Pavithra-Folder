package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class LearningAnnotations extends SeMethods {
	@Test(invocationCount=1)
	public void createLead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);		
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		WebElement leads = locateElement("link","Leads");
		click(leads);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, "Akash&Co");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, "Akash");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, "Corp");
		WebElement dropdown = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(dropdown,3);
		WebElement submit = locateElement("class","smallSubmit");
		click(submit);
	}
		
		@Test(enabled=false)
		public void mergeLead() {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement userName = locateElement("id","username");
			type(userName, "DemoSalesManager");
			WebElement passWord = locateElement("id", "password");
			type(passWord, "crmsfa");
			WebElement login = locateElement("class", "decorativeSubmit");
			click(login);		
			WebElement crmsfa = locateElement("link","CRM/SFA");
			click(crmsfa);
			WebElement leads = locateElement("link","Leads");
			click(leads);
			WebElement mergeLeads = locateElement("link","Merge Leads");
			click(mergeLeads);
			WebElement fromLead = locateElement("xpath","//img[@src=\"/images/fieldlookup.gif\"]");
			click(fromLead);
		}
			
			@Test(dependsOnMethods= {"week5day1.LearningAnnotations.createLead"})
			public void editLead() {
				startApp("chrome", "http://leaftaps.com/opentaps");
				WebElement userName = locateElement("id","username");
				type(userName, "DemoSalesManager");
				WebElement passWord = locateElement("id", "password");
				type(passWord, "crmsfa");
				WebElement login = locateElement("class", "decorativeSubmit");
				click(login);		
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
