package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("chinnarigalla@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[2]")).click();
		driver.findElement(By.id("pass")).sendKeys("nagamani1318");

	
	}
}
