package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test(groups = "Regrssion")
  public void TC1() {
	  Reporter.log("TC 1 is running:" ,true);
}
  @Test(groups = "Sanity")
  public void TC2() {
	  Reporter.log("TC 2 is running:" ,true);
}
  @Test(groups = "Sanity")
  public void TC3() {
	  Reporter.log("TC 3 is running:" ,true);
}
  @Test(groups = "Sanity")
  public void TC4() {
	  Reporter.log("TC 4 is running:" ,true);
}
}
