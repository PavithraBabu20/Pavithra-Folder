import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day5ToSelectAllItemsInList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	       WebElement country = driver.findElementByXPath("//select[@id='userRegistrationForm:countries']");
	       Select ss = new Select(country);
	       System.out.println("Listed below the available country names in the list :");
	       List <WebElement> alloptions = ss.getOptions();
	       for (WebElement eachcountry : alloptions) {
	    	   String country_name = eachcountry.getText();
	    	   System.out.println(country_name);
		}
System.out.println("No.of available countries in the list: "+alloptions.size());
	}

}
