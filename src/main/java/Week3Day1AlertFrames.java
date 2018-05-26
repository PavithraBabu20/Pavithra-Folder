import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week3Day1AlertFrames {

	public static void main(String[] args) {
		String name = "Pavithra";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	       driver.switchTo().frame("iframeResult");
	       driver.findElementByXPath("//button[text()='Try it']").click();
	       Alert alert1 = driver.switchTo().alert();
	       alert1.sendKeys(name);
	       alert1.accept();
	       String text = driver.findElementByXPath("//p[contains(text(),'Pavithra')]").getText();
	       if(text.contains(name))
	       {
	       System.out.println("Both the names are same");
	       }
	  
	}

}
