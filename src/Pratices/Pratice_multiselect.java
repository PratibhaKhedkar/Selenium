package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pratice_multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement r = driver.findElement(By.id("multiselect1"));
		Thread.sleep(1000);
		
		Select s=new Select(r);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("Hyundaix");
		Thread.sleep(1000);
		s.selectByVisibleText("Audi");
		Thread.sleep(1000);
		System.out.println(r);
		Thread.sleep(1000);
		s.deselectAll();
		
	}

}
