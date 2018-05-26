package week5day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LogIn extends SeMethods{
	@Test
	public void run() {
		startApp("gecko", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);		
		
	}
	
	

}
