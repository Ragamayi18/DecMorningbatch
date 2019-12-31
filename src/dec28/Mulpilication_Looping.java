package dec28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulpilication_Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
        for(int i = 0; i <= 20; i++)
        {
            System.out.println("num*i"+  ""+ num*i);
        }
	}

}
