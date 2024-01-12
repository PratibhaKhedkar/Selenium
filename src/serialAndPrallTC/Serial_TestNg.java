package serialAndPrallTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Serial_TestNg {
	  @Test
	  public void TC1() {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
	      Reporter.log("TC 1 is running:" ,true);
	}
	  @Test
	  public void TC2() {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Reporter.log("TC 2 is running:" ,true);
	}
	 
	  @Test
	  public void TC3() {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.ajio.com/");
		  Reporter.log("TC 3 is running:" ,true);
	}
}
