package jan29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Property {

	WebDriver  driver;
	Properties p;
	FileInputStream fi;
	@BeforeTest
	public void setup() throws Throwable
	{
		p=new Properties();
		fi=new FileInputStream("D:\\Decemeber_Selenium\\Workspace\\Sample\\Or.properties");
		p.load(fi);
	    driver=new ChromeDriver();
	    driver.get(p.getProperty("ObjUrl"));
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		driver.findElement(By.xpath(p.getProperty("ObjUsername"))).sendKeys("Admin");
		driver.findElement(By.xpath(p.getProperty("ObjPassword"))).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath(p.getProperty("ObjLogin"))).click();
		String Actval="dash";
		String Expval=driver.getCurrentUrl();
		try {
			Assert.assertEquals(Actval.contains(Expval), "login fail");
		}catch(Throwable t) {
			System.out.println(t.getMessage());
		}
		
		
	}
	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }
}
