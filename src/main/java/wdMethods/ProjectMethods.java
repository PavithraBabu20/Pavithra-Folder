package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	@BeforeMethod(groups= {"Common"})
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
	}
	@AfterMethod(groups= {"Common"})
	public void close() {
		closeBrowser();
	}

	
}
