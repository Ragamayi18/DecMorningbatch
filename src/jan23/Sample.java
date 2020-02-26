package jan23;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeMethod
	public void setup()
	{
	Reporter.log("Running Setup",true);	
	}
	@Test
	public void login()
	{
	Reporter.log("Executing compose test",true);	
	}
	@Test
	public void compose()
	{
	Reporter.log("Executing reply test",true);	
	}
	@Test
	public void reply()
	{
	Reporter.log("Executing login test",true);	
	}
	@AfterMethod
	public void tearDown()
	{
	Reporter.log("Running teardown",true);	

}
}
