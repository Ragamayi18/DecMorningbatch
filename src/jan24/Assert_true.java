package jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_true {

	WebDriver driver;
	@Test
	public void titleverification()
	{
	driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("test");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("submit")).click();
		String Exptitle="dash";
		String Acttitle=driver.getCurrentUrl();
		try {
		Assert.assertTrue(false, Acttitle.contains(Exptitle) +"titele not matching");
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		driver.close();
}
}
