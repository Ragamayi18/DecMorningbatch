package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
       String linkurl=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
       System.out.println("linkurl");
         driver.close();
	}

}
