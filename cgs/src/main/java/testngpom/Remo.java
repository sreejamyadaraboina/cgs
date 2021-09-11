package testngpom;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
	
	@Test( dependsOnMethods = "gun")
	public void run()
	{
		Reporter.log("run succesfully");
	}
	@Test
	public void bun()
	{
		Reporter.log("bun succesfully");
	}
	@Test
	public void gun()
	{
		Reporter.log("gun succesfully");
	}


}
 