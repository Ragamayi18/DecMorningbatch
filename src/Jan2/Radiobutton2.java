package Jan2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();	
		//get collection of radio buttons
		List<WebElement>Olist=driver.findElements(By.xpath("//*[@id=\"u_0_9\"]"));
		System.out.println("no of radio buttons are::"+Olist.size());
		for(int i=0;i<Olist.size();i++)
		{
			//verify the radiobutton is active or inactive
			boolean value=Olist.get(i).isSelected();
			System.out.println(value);

			//get each radiobutton name
			String radiobutname=Olist.get(i).getText();
			System.out.println(radiobutname);
			if(!Olist.get(i).isSelected())
			{
				Olist.get(i).click();	
				Thread.sleep(5000);
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
