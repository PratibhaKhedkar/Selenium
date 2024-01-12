package crossBrowering_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbData {
	@Parameters({"FirstName","LastName","Mobileno"})
	@Test
  //@Test(dataProvider = "Fbregreassion", dataProviderClass = FbDataProvider.class)
  public void f(String FirstName, String LastName, String Mobileno) throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aprati");
	  Thread.sleep(2000);
	  driver.findElement(By.name("lastname")).sendKeys("chole");
	  Thread.sleep(2000);
	  driver.findElement(By.name("reg_email__")).sendKeys("8888473412");
	  Thread.sleep(2000);
  }
}
