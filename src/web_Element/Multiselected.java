package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselected {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	
	Thread.sleep(1000);
	
	WebElement dropdown = driver.findElement(By.id("multiselect1"));
	
	Select s= new Select(dropdown);
	System.out.println(s.isMultiple());
	
	Thread.sleep(1000);
	
	s.selectByIndex(1);
	
	Thread.sleep(1000);
	s.selectByValue("volvox");
	Thread.sleep(1000);
	s.selectByVisibleText("Hyundai");
	Thread.sleep(1000);
	s.deselectByVisibleText("Hyundai");
	
	Thread.sleep(1000);
	s.deselectByIndex(1);
	Thread.sleep(1000);
	s.deselectByValue("audix");
	Thread.sleep(1000);
	s.deselectAll();
	
	
	
	
	

	}

}
