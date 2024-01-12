package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator3 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.booking.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Search']")).click();
		 driver.findElement(By.xpath("//input[@id=':re:']")).sendKeys("goa");
      
	}

}
