import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week3Day1ListSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://erail.in/trains-between-stations/chennai-central-MAS/bangalore-cant-BNC?view=d");
	       //driver.findElementByXPath("//a[text()='Train Name']").click();
          // WebElement table = driver.findElementByXPath(" //table[@class='DataTable DataTableHeader TrainList']");
	       //List <WebElement> allRows = table.findElements(By.tagName("tr"));
           //WebElement firstRow = allRows.get(0);
           //String str = firstRow.getText();
           //System.out.println(str);
	       WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
	    	   List <WebElement> column = table.findElements(By.xpath("//table[@class='DataTable TrainList']//tr/td[2]/a"));
	    	   List<String> allValues = new ArrayList<String>();
	    	   for (WebElement trainNames : column) {
	    		   String names = trainNames.getText();
	    		  allValues.add(names);
			}
	    	   
	    	  for (String printTrainNames : allValues) {
				System.out.println(printTrainNames);
			}
	   
	    	WebElement table1 = driver.findElementByXPath(" //table[@class='DataTable DataTableHeader TrainList']");
		    //List <WebElement> allRows = table1.findElements(By.tagName("tr"));
	        List <WebElement> trainName = table1.findElements(By.tagName("td"));
	        trainName.get(1).click();
	        
	        WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
	    	   List <WebElement> column2 = table2.findElements(By.xpath("//table[@class='DataTable TrainList']//tr/td[2]/a"));
	    	   List<String> allValues1 = new ArrayList<String>();
	    	   for (WebElement trainNames1 : column2) {
	    		   String names = trainNames1.getText();
	    		  allValues1.add(names);
			}
	    	   
	    	  for (String printTrainNames1 : allValues1) {
				System.out.println(printTrainNames1);
			}
	    	   if(allValues.equals(allValues1))
	    	   {
	    		   System.out.println("The List are same");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("The List are different");
	    	   }
	 		}
	
		}
           
           
           



