import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
       WebElement cb1 = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]");
       
       if(cb1.isSelected())
       {
    	   cb1.click();
       }
       
       WebElement cb2 = driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]");
       if(cb2.isSelected())
       {
    	   cb2.click();
       }
       
	}

}
