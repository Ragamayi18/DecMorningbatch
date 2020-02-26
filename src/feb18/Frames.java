package feb18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void frame() throws InterruptedException
	{

	
		WebDriver driver=new ChromeDriver();
				driver.get("https://selenium.dev/selenium/docs/api/java/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.xpath("//li[1]//a[1]")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[contains(text(),'Selenium')]")).click();
		
	
		
	}

}


