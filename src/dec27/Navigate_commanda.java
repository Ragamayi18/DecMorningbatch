package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_commanda {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
         WebDriver driver =new ChromeDriver();
         driver.navigate().to("https://www.google.com/");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         System.out.println("page title::" + driver.getTitle());
         driver.navigate().refresh();
         Thread.sleep(3000);
         System.out.println("pagetitle::"  +driver.getTitle());
         driver.navigate().forward();
         driver.findElement(By.partialLinkText("Gm")).click();
         System.out.println("pagetitle ::"+driver.getTitle());
         driver.navigate().back();
         driver.close();
	}

}
