package testngpom;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	
	@Test
	public void run()
	{
		System.out.println("console");
		Reporter.log("Report");
		Reporter.log("Both Report + Console",true);
	}

}
