package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames");
		
		Thread.sleep(1000);
		
		//on main page 
		String st = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
		System.out.println("display by text: "+st);
		
		//Focus on main page of outer frame 1
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("frame1 display");
		Thread.sleep(1000);
		
		//Focus from outer frame to inner frame
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);
		
		//focus from inner to main page
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//focus from main page to frame2
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		
		//select drop down 
		
		WebElement selectD = driver.findElement(By.id("animals"));
		Select se=new Select(selectD); 
		
		se.selectByIndex(1);
	System.out.println(se.getFirstSelectedOption().getText());
	Thread.sleep(1000);
	
	//focus on frame2 to main page
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	String ss = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	System.out.println("again main page display: "+ss);

	}

}
