package week6day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLeadCopy2 extends ProjectMethods{
	
	@BeforeClass
	public void excelsheet() {
		excelFileName="createLead";
	}
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
	
}
