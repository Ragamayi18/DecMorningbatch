package jan21;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//java time stamp
		DateFormat sdf=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
		Date d=new Date();
		String datef=sdf.format(d);
		//take screen shot and store
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screen shot into local ssytsem
		FileUtils.copyFile(screen, new File("D:\\Decemeber_Selenium\\morningbatch\\sreensht"+datef+"homepage.png"));
		driver.close();

	}

}
