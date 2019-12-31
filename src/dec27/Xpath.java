package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge12!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("login is success");
		}
		else
		{
			String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println("login is failed");
			
		}
				
		
         Thread.sleep(3000);
         driver.close();
	}

}
