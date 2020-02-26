package jan9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		//ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		ac.clickAndHold(source).moveToElement(dst).release();
		ac.perform();
		if(dst.getText().contains("Dropp"))
		{
			System.out.println("Drag and drop success");

		}
		else
		{
			System.out.println("Drag and drop Fail");
		}
		Thread.sleep(7000);
		driver.close();

	}



}
