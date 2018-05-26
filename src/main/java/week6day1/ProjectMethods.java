package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	
	public String excelFileName="";
	
	@Parameters({"browser","url","userName","password"})
	@BeforeMethod
	public void login(String Bws, String Url, String UName, String Pwd ) {
		startApp(Bws, Url);
		WebElement userName = locateElement("id","username");
		type(userName, UName);
		WebElement passWord = locateElement("id", "password");
		type(passWord, Pwd);
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
	}
	@AfterMethod
	public void close() {
		closeBrowser();
	}

	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException {
		
		ReadFromExcel excel1 = new ReadFromExcel();
		return excel1.fetchData(excelFileName);
		
		}
}
