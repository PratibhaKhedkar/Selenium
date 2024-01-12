package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnoations {
	@Test
	  public void test1() {
		  		  
		  Reporter.log("display z method", true);
		  
		  	  }
	  @BeforeMethod
	  public void beforeMethodUse() {
		  		  
		  Reporter.log("BeforeMethod use", true);
		  		  
	  }
	  @AfterMethod
	  public void afterMethodUse() {
		  		  
		  Reporter.log("Aftermethod use", true);
		  		
}
	  @BeforeClass
	  public void BeforeClassUse() {
		  		  
		  Reporter.log("BeforeClass use", true);
		  		
}
	  @AfterClass
	  public void AfterClassUse() {
		  		  
		  Reporter.log("AfterClass use", true);		
}
	
	  @Test
	  public void test2() {
		  		  
		  Reporter.log("display test2 method", true);
		  
		  	  }
	  @BeforeSuite
	  public void BeforeSuiteUse() {
		  		  
		  Reporter.log("BeforeSuite use", true);		
}
	 
	  @BeforeTest
	  public void BeforeTestUse() {
		  		  
		  Reporter.log("BeforeTest use", true);
		  		
}
	  @AfterTest
	  public void AfterTestUse() {
		  		  
		  Reporter.log("AfterTest use", true);		  
		
}
	  @AfterSuite
	  public void AfterSuiteUse() {
		  		  
		  Reporter.log("AfterSuite s use", true);
		  		
}
	  
}
