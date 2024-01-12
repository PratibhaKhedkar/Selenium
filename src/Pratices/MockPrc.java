package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MockPrc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		WebElement li = driver.findElement(By.partialLinkText("Forgotten"));
		System.out.println(li);
		
		WebElement day = driver.findElement(By.cssSelector("#day"));
		Select sday=new Select(day);
		sday.selectByValue("5");
		//System.out.println(sday);
		Thread.sleep(1000);
		
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select smonth=new Select(month);
		smonth.selectByValue("6");
		//System.out.println(smonth);
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select syear=new Select(year);
		syear.selectByValue("2017");
		//System.out.println(syear);
		
		boolean result = driver.findElement(By.xpath("//label[text()='Female']")).isEnabled();
		
		System.out.println("is enable"+result);
		
		
		
	}

}
