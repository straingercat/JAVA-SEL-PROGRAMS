package dropppdowwn;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgpro {
	@Test(priority=-1,invocationCount=2)
	public void demo(){
		Reporter.log("hello world",false);
	
	}
	@Test
	public void hey() {
		Reporter.log("hey",true);
		
	}
	@Test(enabled=false)
	public void status()
	{
		Reporter.log("staus",true);
	}
	

}
