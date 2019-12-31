package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Matching_title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String str1="Google";
		String str2="google";
		//String str2=driver.getTitle();
		if(str2.equalsIgnoreCase(str1))
		{
		    System.out.println("the title is available"   );
		    
		}
		else
		{
			System.out.println("the title is not available");
	    }
		Thread.sleep(3000);
		driver.close();

}
}
