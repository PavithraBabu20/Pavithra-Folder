package firstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElementById("username").sendKeys("DemoSalesManager");
	       driver.findElementById("password").sendKeys("crmsfa");
	       driver.findElementByClassName("decorativeSubmit").click();
	       driver.findElementByLinkText("CRM/SFA").click();
	       driver.findElementByLinkText("Create Lead").click();
	       driver.findElementById("createLeadForm_companyName").sendKeys("CapGemini");
	       driver.findElementById("createLeadForm_firstName").sendKeys("Pavithra");
	       driver.findElementById("createLeadForm_lastName").sendKeys("Babu");
	       driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Pavi1");
	       driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Babu1");
	       driver.findElementById("createLeadForm_personalTitle").sendKeys("PavithraBabu");
	       WebElement mySelectElement = driver.findElementById("createLeadForm_dataSourceId");
	       Select source= new Select(mySelectElement);
	       source.selectByVisibleText("Direct Mail");
	       driver.findElementById("createLeadForm_birthDate-button").click();
	       driver.findElementByXPath("//td[text()='May, 1992']");
	       driver.findElementByXPath("//tr[@class='daysrow']/td[@class='selected day']").click();
	       
	}

}
