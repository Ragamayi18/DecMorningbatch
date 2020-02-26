package jan25;

import java.io.BufferedReader;
import java.io.Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class Read {

	public static void main(String[] args) throws Throwable {
		//
		FileReader fr=new FileReader();
		//BufferedReader br=new BufferedReader(fr);
		String str="";
	//	while((str=br.readLine())!=null)
		{
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");;
		driver.manage().window().maximize();
	String login[]=str.split(";");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(login[0]);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(login[1]);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	if(driver.getCurrentUrl().contains("dash"))
	{
		System.out.println("login success");
	}
	else
	{
		System.out.println("login Fail");
	}
	driver.close();
		}
		//br.close();
	}

}
