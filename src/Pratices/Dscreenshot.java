package Pratices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//

public class Dscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		RandomString rs=new RandomString();
		String s=rs.make(3);
		
		File des = new File("F:\\Database Velocity\\scnshot\\ddd\\diwaliframe"+s+".png");
		
		FileHandler.copy(src, des);
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://chercher.tech/practice/frames");
//		
//	      Thread.sleep(1000);
//		
//
//	
//	String mainpagetext = driver.findElement(By.xpath("//h1[text()='Frames Examples']")).getText();
//	System.out.println("mainpage text is :"+mainpagetext );
//	Thread.sleep(1000);
//	driver.switchTo().frame("frame1");
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("diwali  practices");
//	Thread.sleep(1000);
//	driver.switchTo().frame("frame3");
//	driver.findElement(By.id("a")).click();
//	Thread.sleep(1000);
//	driver.switchTo().defaultContent();
//	Thread.sleep(1000);
//	driver.switchTo().frame("frame2");
//	Thread.sleep(1000);
//	WebElement animaldropdown = driver.findElement(By.id("animals"));
//	Select sa=new Select(animaldropdown);
//	sa.selectByValue("babycat");
//	
//	Thread.sleep(1000);
//	driver.switchTo().defaultContent();
//    Thread.sleep(1000);
//	
//	String mainpageA = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
//	
//	System.out.println(mainpageA);
//	
//	
	}

}
