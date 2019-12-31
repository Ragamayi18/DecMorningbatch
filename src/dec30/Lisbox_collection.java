package dec30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lisbox_collection {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver  driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("REG")).click();

		Select country=new Select(driver.findElement(By.name("country")));
		List<WebElement> listitem=country.getOptions();
		System.out.println("no of items:"+listitem.size());
		Thread.sleep(3000);
		for(int i=0; i<listitem.size();i++) {
           
			 //get each item name
			String eachitem=listitem.get(i).getText();
			System.out.println(eachitem);
			
			
			//click on eachitem
			
			listitem.get(i).click();
		}
		     Thread.sleep(3000);
			driver.close();


		}



	}


