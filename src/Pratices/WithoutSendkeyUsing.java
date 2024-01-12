package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendkeyUsing {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
		 
		WebElement searchbox = driver.findElement(By.name("email"));
		 Thread.sleep(1000);
		WebElement searchbox2 = driver.findElement(By.name("pass"));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].value='pratibhachole41@gmail.com'", searchbox);
		 Thread.sleep(1000);
		 js.executeScript("arguments[0].value='Pratibha@123'", searchbox2);
		 
		 driver.findElement(By.name("login")).click();
	}

}
