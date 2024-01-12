package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practices_1 {

	WebDriver driver =new ChromeDriver();
	public static void main(String[] args) {
		
		practices_1 s=new practices_1();
		
		s.display();
		
		
		
	
	}
	public void display() 
	{
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ta1")).sendKeys("Hi i m pratibha ");
	}
	public void dropDownUse() throws InterruptedException 
	{
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		boolean r = driver.findElement(By.id("multiselect1")).isSelected();
		System.out.println(r);
		WebElement el = driver.findElement(By.id("multiselect1"));
		
		Select sel=new Select(el);
		System.out.println(sel.isMultiple());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		sel.selectByIndex(0);
		sel.selectByVisibleText("Audi");
		sel.selectByValue("swiftx");
		Thread.sleep(1000);
		sel.deselectAll();
		
	}

}
