package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_methods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Select datelistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select  monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		boolean value1=datelistbox.isMultiple();
		System.out.println(value1);
		boolean value2=monthlistbox.isMultiple();
		System.out.println(value2);
		boolean value3=yearlistbox.isMultiple();
		System.out.println(value3);

		monthlistbox.selectByVisibleText("Mar");
		System.out.println(monthlistbox.getFirstSelectedOption());
		Thread.sleep(3000);

		yearlistbox.selectByVisibleText("1998");
		System.out.println(yearlistbox.getFirstSelectedOption());
		Thread.sleep(3000);

		//select by value
		datelistbox.selectByValue("22");
		System.out.println(datelistbox.getFirstSelectedOption());
		Thread.sleep(3000);

		yearlistbox.selectByValue("1998");
		System.out.println(yearlistbox.getFirstSelectedOption());
		Thread.sleep(3000);
		
		monthlistbox.selectByValue("5");
		System.out.println(monthlistbox.getFirstSelectedOption());
		Thread.sleep(3000);

		//select by index
		datelistbox.selectByIndex(7);
		System.out.println(datelistbox.getFirstSelectedOption());
        Thread.sleep(3000);
        
        monthlistbox.selectByIndex(6);
        System.out.println(monthlistbox.getFirstSelectedOption());
        Thread.sleep(3000);
        
        yearlistbox.selectByIndex(40);
        System.out.println(yearlistbox.getFirstSelectedOption());
        Thread.sleep(3000);
        driver.close();
	}
	
	
	
	





}
