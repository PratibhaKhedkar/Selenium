package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Diwalistudydropdown {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://demoqa.com/select-menu");
	 
	 Thread.sleep(1000);
	 
	 //single select dropdown
	 WebElement fo = driver.findElement(By.id("oldSelectMenu"));
	 Thread.sleep(1000);
	 Select so=new Select(fo);
	 Thread.sleep(1000);
	 so.selectByIndex(4);
	 Thread.sleep(1000);
	 so.selectByValue("2");
	 Thread.sleep(1000);
	 so.selectByVisibleText("White");
	
	 
	 //multiselect dropdown
	 
	WebElement cf = driver.findElement(By.id("cars"));
	 Select s=new Select(cf);
	 Thread.sleep(1000);
	 s.selectByIndex(3);
	 Thread.sleep(1000);
	 s.selectByValue("saab");
	 Thread.sleep(1000);
	 s.selectByVisibleText("Volvo");	 
	 Thread.sleep(1000);
	 System.out.println(s.getFirstSelectedOption().getText());
	 
	 

	}

}
