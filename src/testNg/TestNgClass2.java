package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 {
  @Test
  public void myMethod() {
	  
	  System.out.println("Hello console.. I am standard output");
	  Reporter.log("Hello and report : boolean true", true);
	  Reporter.log("Hello ...report: boolean false", false);
  }
}
