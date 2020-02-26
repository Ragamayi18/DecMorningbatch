package jan23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkingtitle {

	WebDriver driver;
	@Test
	public void titleverification()
	{
	driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String Exptitle="google";
		String Acttitle=driver.getTitle();
		try {
		Assert.assertEquals(Acttitle, Exptitle,"Title is not matching");
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		driver.close();
}
}