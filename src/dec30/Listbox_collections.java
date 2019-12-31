package dec30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_collections {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Select All=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> listitem=All.getOptions();
		System.out.println( "no of items:"+listitem.size());
		Thread.sleep(3000);
		for(int i=0;i<listitem.size();i++)
		{
			String eachitem=listitem.get(i).getText();
			System.out.println(eachitem);
			Thread.sleep(3000);
			listitem.get(i).click();
			
		}
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
