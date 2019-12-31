package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.way2sms.com/");
        driver.findElement(By.name("mobileNo")).sendKeys("9440467320");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("K3334c");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button[1]")).click();
       
	}

}
