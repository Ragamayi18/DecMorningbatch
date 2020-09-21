package jan23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void registerLink() throws Throwable
	{
		driver.findElement(By.partialLinkText("REG")).click();
		Reporter.log("Executing Register link",true);
		Thread.sleep(4000);
		}
		@Test
		public void hotelLink()throws Throwable
		{
		driver.findElement(By.partialLinkText("Hot")).click();
		Reporter.log("Executing hotel link",true);
		Thread.sleep(4000);
		}
		@Test(priority=2)
		public void carrentalsLink()throws Throwable
		{
		driver.findElement(By.partialLinkText("Car")).click();
		Reporter.log("Executing carrental link",true);
		Thread.sleep(4000);
		}
		@AfterMethod
		public void teardown() throws Throwable
		{
		Thread.sleep(4000);
		driver.close();	
		Reporter.log("Running teardown",true);
	
	}
	}
