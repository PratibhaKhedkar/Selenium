package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Isdis {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu/");
		
		Thread.sleep(1000);
		
		 WebElement dropDown = driver.findElement(By.xpath("//select[@name='cars']"));
		 Thread.sleep(1000);
		 
		 Select s=new Select(dropDown);
	
		 System.out.println(s.isMultiple());
		 Thread.sleep(1000);
		 
		 s.selectByIndex(0);
		 Thread.sleep(1000);
		 s.selectByValue("audi");
		 Thread.sleep(1000);
		 s.deselectAll();
		 
	}

	
	

}
