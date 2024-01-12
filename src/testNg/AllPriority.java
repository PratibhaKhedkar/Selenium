package testNg;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllPriority {
	@Test(priority = -3, dependsOnMethods = {"d"})
	  public void a() {
		  Reporter.log("a is running:", true);
	  }
	@Test(invocationCount = 2)
	  public void b() {
		  Reporter.log("b is running:", true);
	  }
	@Test(timeOut = 2000)
	  public void c() throws InterruptedException {
		Thread.sleep(1000);
		  Reporter.log("c is running:", true);
	  }
	@Test(priority = 3)
	  public void d() {
		  Reporter.log("d is running:", true);
	  }
}
