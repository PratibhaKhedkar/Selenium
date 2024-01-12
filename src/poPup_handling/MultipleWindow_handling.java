package poPup_handling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_handling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ntc__chip-label'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ntc__chip-label'])[3]")).click();
		Thread.sleep(1000);
		
		Set<String> handles = driver.getWindowHandles();
		
		   ArrayList<String> handle_array = new ArrayList<String>(handles);
		   
		   System.out.println(handle_array.size());
		   
		   for(int i=0; i<handle_array.size(); i++)
		   {
			   driver.switchTo().window(handle_array.get(i));
			   System.out.println(driver.getTitle());
			   System.out.println(driver.getCurrentUrl());
			   System.out.println("=================================");
		   }
		
		
		
		

	}

}
