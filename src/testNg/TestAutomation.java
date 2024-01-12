package testNg;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAutomation {
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
	  @Test
	  public void test2() {
		  
		  
		  Reporter.log("display 2nd test method", true);
		  
		  
	  }
}
