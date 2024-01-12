package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enbl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("987646782");
		Thread.sleep(1000);
		
		boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		Thread.sleep(1000);
		
		System.out.println("is enable display"+result);
		
		
		

	}

}
