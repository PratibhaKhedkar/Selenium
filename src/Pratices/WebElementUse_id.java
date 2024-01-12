package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementUse_id {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bus.irctc.co.in/home");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginuserid")).sendKeys("Pratibha00");
	
		Thread.sleep(1000);
		driver.findElement(By.id("loginuserid")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id("loginuserid")).sendKeys("Rutvi");
		
		Thread.sleep(1000);
				
        String r = driver.findElement(By.id("home-tab")).getText();
        System.out.println(r);
   Thread.sleep(1000);
   
     boolean isd = driver.findElement(By.id("profile-tab")).isDisplayed();
        System.out.println(isd);
        Thread.sleep(1000);
        boolean en = driver.findElement(By.id("profile-tab")).isEnabled();
       System.out.println(en);
       Thread.sleep(1000);
          boolean iss = driver.findElement(By.id("profile-tab")).isSelected();
       System.out.println(iss);
      
	}

}
