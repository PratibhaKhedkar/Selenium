package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		  Thread.sleep(2000);
		  	  
		  boolean result= driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		  
		  System.out.println("Get otp button status is "+result);
		  Thread.sleep(2000);
		  
	}

}
