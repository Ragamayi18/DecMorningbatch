package dec30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_Each_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links::"+links.size());
		for(WebElement each:links) {
			System.out.println(each);
			String linkname=each.getAttribute("href");
			String linkurl=each.getText();
			System.out.println("linkname" +"\n" +linkurl);
		}
	}


}
