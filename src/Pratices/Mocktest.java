package Pratices;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mocktest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		//System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		Dimension default_size = driver.manage().window().getSize();
		System.out.println(default_size);
		
		
		

	}

}
