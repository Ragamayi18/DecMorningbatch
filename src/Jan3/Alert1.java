package Jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on login button with out filling login details
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		//get alert text
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		
		//conform alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//enter invalid password
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();

	}

}
