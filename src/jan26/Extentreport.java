package jan26;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	
		
		public void generateReport()
		{
			//generate html report under proiject
			report=new ExtentReports("./Reports/Mrng.html");	
		}
	 
		@Test
		public void passTest()
		{
			//test case starts here
			test=report.startTest("Test Case Pass");
			test.assignAuthor("Ranga Senior QA Engineer");
			test.assignCategory("Functional Test");
			test.log(LogStatus.PASS, "Test Pass");
			try {
				Assert.assertFalse(true);
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}
		@Test
		public void failTest()
		{
			//test case starts here	
			test=report.startTest("Test CAse Fail");
			test.assignAuthor("Ranga Senior QA Engineer");
			test.assignCategory("Functional Test");
			test.log(LogStatus.FAIL, "Test Fail");
			try {
				Assert.assertTrue(false);
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());	
			}
		}
		@Test
		public void skipTest()
		{
			//test case starts here	
			test=report.startTest("Skipping Test Case");
			test.assignAuthor("Ranga Senior QA Engineer");
			test.assignCategory("Functional Test");
			test.log(LogStatus.SKIP, "Test Case Skip");
			try {
				throw new SkipException("Skipping test case");
			}catch(Throwable t)
			{
			System.out.println(t.getMessage());
			}
		}
		@AfterMethod
		public void tearDown()
		{
			report.endTest(test);	
			report.flush();
	}
	

}
