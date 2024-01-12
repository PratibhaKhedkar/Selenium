package dropDwonPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 
		driver.findElement(By.partialLinkText("new account")).click();
		Thread.sleep(1000);
		 
		 WebElement date = driver.findElement(By.id("day"));
		 
		Select sDay=new Select(date);
		
		//System.out.println("disply of month"+m);
		sDay.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select sMonth =new Select(month);
		
		sMonth.selectByIndex(7);
		sMonth.selectByVisibleText("Jul");
		 // sMonth.deselectByVisibleText("Sep");
		
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select sYear=new Select(year);
		  sYear.selectByValue("2018");
		  
		boolean result = sYear.isMultiple();
		  
		  System.out.println("multipl"+result);
	}

}
