package jan25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriitingfromWeb {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//writing from web to notepad
		File fi=new File("E://wtritingtext");
		fi.createNewFile();
		FileWriter fw=new FileWriter(fi);
		BufferedWriter bw=new BufferedWriter(fw);
		WebDriver driver =new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
String para1=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/p[1]")).getText();	
String para2=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/p[2]")).getText();
bw.write(para1);
bw.newLine();
bw.newLine();
bw.write(para2);
bw.flush();
bw.close();
		
	}

}
