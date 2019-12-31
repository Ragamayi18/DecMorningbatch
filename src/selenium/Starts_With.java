package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Starts_With {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String strprotocol="https";
		String stractprotocol=driver.getCurrentUrl();
		if(stractprotocol.startsWith(strprotocol))
		//if(stractprotocol.endsWith(strprotocol))
		{
           System.out.println("url is secured");
           
	    }
		else
		{ 
			System.out.println("url is not secured");
			
		}

}
}