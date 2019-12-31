package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	   WebDriver driver=new  ChromeDriver();
	   driver.get("https://www.gmail.com/");
	   driver.findElement(By.name("identifier")).sendKeys("ragamayigalla13@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span[1]/span[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.name("password")).sendKeys("nagamani1318");
	   Thread.sleep(3000);
	   driver.findElement(By.id("passwordNext")).click();
}
}