package firstProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wdMethods.SeMethods;



public class Myntra extends SeMethods {
	@Test
	public  void myntra () {
		//To Launch the Chrome Browser
		startApp("chrome", "https://www.myntra.com/");
		WebElement search = locateElement("class","desktop-searchBar");
		type(search, "Sunglasses");
		
		
		/*
		driver.getKeyboard().sendKeys(Keys.ENTER);

		List<WebElement> allBrands = driver.findElementsByClassName("product-brand");
		int size1 = allBrands.size();
		System.out.println("No.of brands in that list"+size1);

		Set<WebElement> uniqueBrandNames = new HashSet<WebElement>();
		uniqueBrandNames.addAll(allBrands);

		System.out.println("***********************************************");
		for (WebElement string : uniqueBrandNames) {

			System.out.println(string.getText());
		}
		List<WebElement> allDiscounts = driver.findElementsByXPath("//span[text()='(40% OFF)']");
		int size = allDiscounts.size();
		System.out.println(size);
		List<WebElement> gender = driver.findElementsByXPath("//h4[contains(text(),'Unisex')]");
		int unisex = gender.size();
		System.out.println(unisex);
		driver.findElementByXPath("//li[@data-colorhex='green']").click();
		driver.findElementByXPath("//ul[@class='results-base']/li[2]").click();
		WebElement product = driver.findElementByXPath("//h1[@class='pdp-title']");
		String productName = product.getText();
		System.out.println("The name of the selected product is "+productName);
		WebElement productPrice = driver.findElementByXPath("//strong[@class='pdp-price']");
		String prodPrice = productPrice.getText();
		System.out.println("The name of the selected product is "+prodPrice);
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
		driver.findElementByXPath("//span[@data-reactid='523']").click();
		WebElement product1 = driver.findElementByXPath("//a[@class='c-gray']");
		String productName1 = product1.getText();
		System.out.println("The name of the selected product is "+productName1);
		WebElement productPrice1 = driver.findElementByXPath("//div[@class='c-dblue total-rupees']");
		String prodPrice1 = productPrice1.getText();
		System.out.println("The name of the selected product is "+prodPrice1);
		if(productName.equals(productName1) ) {
			System.out.println("Same Product Name");
		}
		else {
			System.out.println("Not same");
		}

		//Compare ProductPrice
		if(prodPrice.contentEquals(prodPrice1)) {
			System.out.println("Same Price");
		}
		else {
			System.out.println("Not Same Price");
		}
		driver.close();*/
	}
}
