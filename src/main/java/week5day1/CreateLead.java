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

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class CreateLead extends ProjectMethods{
	@Test()
	public void createLead() {
		
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
}
