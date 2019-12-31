package dec28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collection_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links:::"+links.size());		
		for(int i=0;i<links.size();i++)
		{
			String linkname=links.get(i).getText();
			String linkurl=links.get(i).getAttribute("href");
			System.out.println (linkname  +"\n" +linkurl);
		}
		
       driver.close();
	}

	}

