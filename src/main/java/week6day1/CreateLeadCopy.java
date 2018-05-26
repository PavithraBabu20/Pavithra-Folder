package week6day1;

import org.testng.annotations.Test;
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

public class CreateLeadCopy extends ProjectMethods{
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
	public Object[][] fetchData() throws IOException {
		//open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/createLead.xlsx");
		//Go to the specific sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Access the rows
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		//Access the Columns
		int cellNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowNum][cellNum];
		System.out.println(cellNum);
		//read Data and Print
	    for (int i = 1; i<=rowNum;i++) {
	    	XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellNum;j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data);
			}
		}
	    wBook.close();
	    return data;
		
		}
}
