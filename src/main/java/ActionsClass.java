import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://jqueryui.com/sortable/");
	       /*WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
	       driver.switchTo().frame(frame);
	       WebElement drag = driver.findElementByXPath("//div[@id='draggable']");
	       
	       Actions dr = new Actions(driver);
	       dr.dragAndDropBy(drag, 100, 100).perform();*/
	       
	       WebElement frame1 = driver.findElementByXPath("//iframe[@class='demo-frame']");
	       driver.switchTo().frame(frame1);
	       /*driver.getKeyboard().sendKeys(Keys.CONTROL);
	       driver.findElementByXPath("//ol[@class='ui-selectable']//li[1]").click();
	       driver.findElementByXPath("//ol[@class='ui-selectable']//li[2]").click();
	       driver.findElementByXPath("//ol[@class='ui-selectable']//li[3]").click();*/
	       
	       WebElement ele1 = driver.findElementByXPath("//ul[@id='sortable']//li[1]");
	       WebElement ele2 = driver.findElementByXPath("//ul[@id='sortable']//li[3]");
	       Actions dr = new Actions(driver);
	       dr.dragAndDrop(ele2, ele1).release().perform();
	       
	}

}
