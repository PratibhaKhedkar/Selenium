package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
	driver.findElement(By.partialLinkText("Create new ")).click();
		Thread.sleep(1000);
		
		
		WebElement Date = driver.findElement(By.id("day"));
		
		Select sDay=new Select(Date);
		
	    
	     sDay.selectByValue("20");
	     
	     
	     WebElement month = driver.findElement(By.id("month"));
	     
	     Select sMonth=new Select(month);
	     
	     sMonth.selectByIndex(7);
	     
	     WebElement Year = driver.findElement(By.id("year"));
	     
	     Select sYear=new Select(Year);
	     
	     sYear.selectByValue("2019");
	     
	     boolean result=sYear.isMultiple();
	     
	     System.out.println(result);
	     
	     
	     
	 
	     
	     
		

	}

}
