package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMethod_use {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("pratibha");
		
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("chole");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("selenium_automation_practice")).click();
		
		//Thread.sleep(2000);
		
		boolean checkradio = driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
		
		System.out.println("Check radio button " +checkradio);
		
		Thread.sleep(2000);
		
		WebElement radioElement = driver.findElement(By.xpath("//input[@value='Female']"));
		radioElement.click();
		
		Thread.sleep(2000);
		
	boolean ExpresCheck = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
	
	System.out.println("Exprs check is "+ExpresCheck);
	Thread.sleep(2000);
	
	WebElement exprienceClick = driver.findElement(By.xpath("//input[@value='2']"));
	exprienceClick.click();
	Thread.sleep(2000);
	
	boolean result = driver.findElement(By.xpath("(//input[@name='profession'])[1]")).isSelected();
	System.out.println("profession check "+result);
	Thread.sleep(2000);
	
	WebElement professionCheck = driver.findElement(By.xpath("(//input[@name='profession'])[1]"));
	professionCheck.click();
	Thread.sleep(2000);
	
	
	WebElement StorePath = driver.findElement(By.name("selenium_commands"));
	 Select s1=new Select(StorePath);
	 Thread.sleep(2000);
	 
	 boolean checkMultiple = s1.isMultiple();
	 System.out.println("multiple check option drop down "+checkMultiple);
	Thread.sleep(2000);
	 
	 
	 s1.selectByVisibleText("Browser Commands");
	 Thread.sleep(2000);
	 s1.selectByIndex(1);
	 Thread.sleep(2000);
	 s1.selectByIndex(2);
	 Thread.sleep(2000);
	 s1.selectByIndex(3);
	 Thread.sleep(2000);
	 
	 s1.deselectByVisibleText("Browser Commands");
	 Thread.sleep(2000);
	 
	 s1.deselectByIndex(1);
	 Thread.sleep(2000);
	 s1.deselectByIndex(2);
	 Thread.sleep(2000);
	 s1.deselectByIndex(3);
	 Thread.sleep(2000);
	 driver.findElement(By.name("submit")).click();
	 
	 
	
		
		
	}

}
