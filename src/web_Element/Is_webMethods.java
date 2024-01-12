package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_webMethods 
{ 
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://ultimateqa.com/dummy-automation-websites/");
	 
	 Thread.sleep(1000);
	 String exResult = "20 Websites to Practice Automation Testing (UI, API, Mobile)";
	 String actualResult = driver.findElement(By.className("entry-title")).getText();
	 
	 System.out.println(actualResult);
	 
	 if(exResult.equals(actualResult)) 
	 {
		 System.out.println("test matching tc is passed");
	 }
	 else 
	 {
		 System.out.println("test matching tc is failed");
		 
	 }
	 
	
}
}