package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	
	
	static RemoteWebDriver driver;	
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser is Launched");

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);		
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			case "partialText":
				return driver.findElementByPartialLinkText(locValue);
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			
			//e.printStackTrace();
			System.out.println("Webelement not found");
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The Value is Entered");
			takeSnap();
		} catch (WebDriverException e) {			
			//e.printStackTrace();
			System.out.println("Text Field Not enabled");
		}
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element Is Clicked");
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element Is Clicked");

	}

	public String getText(WebElement ele) {
		String txt=null;
		try {
			 txt=ele.getText();
		} catch (NoSuchElementException e) {			
			//e.printStackTrace();
			System.out.println("No element found to Get the text");
		}
		return txt;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropDown=new Select(ele);
		dropDown.selectByVisibleText(value);
		System.out.println("The" +ele +"dropdown is selected with value "+value);
		takeSnap();

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		
		Select dropDown=new Select(ele);
		dropDown.selectByIndex(index);
		System.out.println("The" +ele +"dropdown is selected with value "+index);
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle) {
		driver.getTitle().contains(expectedTitle);
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		ele.getText().equals(expectedText);

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		ele.getText().contains(expectedText);
	

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		ele.getAttribute(value);

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isSelected();

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> wHandles = driver.getWindowHandles();
		System.out.println(wHandles.size());
		List<String> lisOfWindows=new ArrayList<String>();
		lisOfWindows.addAll(wHandles);
		String secWindow = lisOfWindows.get(index);
		driver.switchTo().window(secWindow);
		System.out.println("Switched to the requested window");
		System.out.println(driver.getCurrentUrl());

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);

	}

	public void acceptAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		System.out.println("Accpted the alert");

	}

	public void dismissAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.dismiss();
		System.out.println("Dismissed the alert");

	}

	public String getAlertText() {

		
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Active screen in the Browser is closed ");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("All the Windows in the browser are closed ");

	}

	@Override
	public void startAppDisableNotification(String browser, String url) {
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				   ChromeOptions options = new ChromeOptions();
				   options.addArguments("--disable-notifications");
			       driver=new ChromeDriver(options);		
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser is Launched");
		} catch (WebDriverException e) {
			
			//e.printStackTrace();
			System.err.println("Browser not loaded");
		}
		
	}



}
