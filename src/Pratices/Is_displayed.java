package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
	 System.out.println(driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).isDisplayed());
		
		//hideen butn
		//boolean a = driver.findElement(By.xpath("//*[@id='hbutton']")).isDisplayed();
		// boolean b = driver.findElement(By.id(null)).isDisplayed();
		 
		 //System.out.println(a);
		 //System.out.println(b);
		             
		
		

	}

}
