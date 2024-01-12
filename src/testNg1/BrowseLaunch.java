package testNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BrowseLaunch {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  System.out.println("Hello console.. I am standard output");
	  Reporter.log("Hello and report : boolean true", true);
	  Reporter.log("Hello ...report: boolean false", false);
  }
}
