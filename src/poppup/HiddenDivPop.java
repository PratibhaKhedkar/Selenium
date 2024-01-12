package poppup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");//or link https://www.edureka.co/blog/handle-multiple-windows-in-selenium/
		Thread.sleep(1000);
		
		System.out.println("==========Hidden division popup===================");
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile Apple");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
		

	}

}
