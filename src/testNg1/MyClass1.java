package testNg1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
 
	  @Test
	  public void a()
	  {
	  Reporter.log("Hi a is running", true);
	  }
	  @Test
	  public void b()
	  {
	  Assert.fail();
	  Reporter.log("Hi b is running", true);
	  }
	  @Test(dependsOnMethods = {"b"})
	  public void c()
	  {
	  Reporter.log("Hi c is running", true);
	  }
	  @Test
	  public void d()
	  {
	  Reporter.log("Hi d is running", true);
	  }
  }

