package jan4;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(6000);			
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'RAIL DRISHTI')]")).click();
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		Iterator<String>x=brw.iterator();
		while(x.hasNext())
		{
			String child=x.next();
			if(!parent.equals(child))
			{
				String pagetitle=driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(6000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("HYDERABAD DECAN - HYB");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("BANGARMAU - BGMU");
		Thread.sleep(6000);
		driver.close();

	}

}
