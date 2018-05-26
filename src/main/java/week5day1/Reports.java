package week5day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) throws IOException {
		//to create a folder and store the reports using ExtentHtmlReporter class
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		//to retain the previous reports along with the current report
		html.setAppendExisting(true);
		// to make the generated report in editable mode using ExtentReports class
		ExtentReports extents = new ExtentReports();
		// to attach the generated html file 
		extents.attachReporter(html);
		//to give name and description for your test case
		ExtentTest test = extents.createTest("tc001","Create a new lead");
		//to assign category and author to categorise the test runs accordingly
		test.assignCategory("Smoke");
		test.assignAuthor("Anu");
		//to print the expected result for your passed or failed steps and to add a screenshot along with it
		test.pass("Create lead is success",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.fail("Create lead is success",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		//mandatory to use flush method  just to execute all the above lines
		extents.flush();		

	}

}
