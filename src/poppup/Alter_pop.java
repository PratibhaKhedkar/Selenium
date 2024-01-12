package poppup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_pop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		//handling of alert popup
		//that why we need  change the focus main page to alert
		
		Alert b = driver.switchTo().alert();
		Thread.sleep(1000);
		
		//if i want to clik on cancle button then we use dismiss method 
		
   b.dismiss();
	Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("Hello");		
	
		
//		b.getText();
//		Thread.sleep(1000);
//		driver.findElement(By.name("cusid")).sendKeys("Hello");
//		
//		b.accept();
//		Thread.sleep(1000);
//		driver.findElement(By.name("cusid")).sendKeys("Good");
//		

		
		
	}

}
