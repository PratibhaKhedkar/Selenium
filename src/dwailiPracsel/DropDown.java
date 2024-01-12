package dwailiPracsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://book.spicejet.com/Default.aspx");
//		Thread.sleep(1000);
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(1000);
//		
//		
//		//select Adult
//		WebElement adult = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
//		Thread.sleep(1000);
//		
//		Select sAdult=new Select(adult);
//		Thread.sleep(1000);
//		
//		sAdult.selectByIndex(3);
//		Thread.sleep(1000);
//		
//		System.out.println("No. of Adults= "+sAdult.getFirstSelectedOption().getText());
//		
//		
//		//select child
//		
//		WebElement child = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
//		Thread.sleep(1000);
//		Select sChild= new Select(child);
//		Thread.sleep(1000);
//		sChild.selectByIndex(2);
//		Thread.sleep(1000);
//		System.out.println("No. of child= "+sChild.getFirstSelectedOption().getText());
//       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		
		//add adult by using while or for loop
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
