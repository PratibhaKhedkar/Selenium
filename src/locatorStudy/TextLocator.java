package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.get("https://www.facebook.com/");
		
		
		
		//driver.findElement(By.xpath("//h2[contains(text()='Facebook helps you connect ')]")).click();
		
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("mumbai");
	}
	
	

}
