package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String linktext=driver.findElement(By.partialLinkText("Gm")).getText();
        String actualtext="gmail";
        if(actualtext.equalsIgnoreCase(linktext)) {
        	
        	System.out.println("linktext is matching"+ linktext  + " " +actualtext);
        	
        }
        else
        {
        	System.out.println("linktext is not matching" + linktext   +""  +actualtext);
        }
           Thread.sleep(3000);
           driver.close();
        }

}
