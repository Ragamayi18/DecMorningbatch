package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		System.out.println("pagetitle ="+pageTitle);
		System.out.println("pagelength="+pageTitle.length());
        String pageurl=driver.getCurrentUrl();
        System.out.println("pageurl="+pageurl);
        System.out.println("pageurl length="+ pageurl.length());
        driver.close();
	}

}
