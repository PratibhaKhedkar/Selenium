package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass3 {
  @Test
  public void fbLaunch() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("fbLaunch: boolean true", true);
	  
	  
  }
  @Test
  public void amazonLaunch() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Reporter.log("amazonLaunch: boolean true", true);
	  
	  
  }
  @Test
  public void flipkartLaunch() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Reporter.log(" flipkartLaunch: boolean true", true);
	  
	  
  }
}
