package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
//  @Test(priority=3)
//  public void a() {
//	  Reporter.log("Priority a: ", true);
//  }
//  @Test(priority=3)
//  public void b() {
//	  Reporter.log("Priority b: ", true);
//  }
//  @Test(priority=3)
//  public void c() {
//	  Reporter.log("Priority c: ", true);
//  }
//  @Test(priority=3)
//  public void d() {
//	  Reporter.log("Priority d: ", true);
//  }
	
	
	
	@Test(priority=3)
	  public void a() {
		  Reporter.log("Priority a: ", true);
	  }
	  @Test(priority=2)
	  public void b() {
		  Reporter.log("Priority b: ", true);
	  }
	  @Test(priority=-5)
	  public void c() {
		  Reporter.log("Priority c: ", true);
	  }
	  @Test(priority=4)
	  public void d() {
		  Reporter.log("Priority d: ", true);
	  }

@Test
public void e() {
	  Reporter.log("Priority e: ", true);
}
}
	  
