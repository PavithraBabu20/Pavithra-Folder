package week6day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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

public class CreateLead extends ProjectMethods{
	@Test( dataProvider="fetchData")
	public void createLead(String company, String fName, String lName) {
		
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		WebElement leads = locateElement("link","Leads");
		click(leads);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, company);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, fName);
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, lName);
		WebElement dropdown = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(dropdown,3);
		WebElement submit = locateElement("class","smallSubmit");
		click(submit);
		
		
}
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		Object [][] data = new Object[2][3];
		data [0][0] = "CapGemini";
		data [0][1] = "Anu";
		data [0][2] = "Govindan";
		
		data [1][0] = "CapGemini";
		data [1][1] = "Pavithra";
		data [1][2] = "Babu";
		return data;
	}
}
