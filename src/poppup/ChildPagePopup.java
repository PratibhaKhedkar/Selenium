package poppup;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ChildPagePopup {

	public static void main(String[] args) throws InterruptedException, IOException {
     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		Iterator<String> pageId = allwindowId.iterator();
		String mainpage = pageId.next();
		 String childPage = pageId.next();
		 System.out.println("Main page ID "+mainpage);
		 System.out.println("Child Page Id "+childPage);
		 Thread.sleep(1000);
		 driver.switchTo().window(childPage);
		 driver.manage().window().maximize();
		 driver.findElement(By.id("the7-search")).sendKeys("Hello");
		 
		 WebElement childpageText = driver.findElement(By.xpath("//h1[text()='About me']"));
		 System.out.println("Child Page Text: "+childpageText);
		 Thread.sleep(1000);
		 
		 driver.switchTo().window(mainpage);
		 Thread.sleep(1000);
		 
		 String mainpageText1 = driver.findElement(By.xpath("//p[contains(text(),'Click below to open link in new tab')]")).getText();
		 System.out.println("Main page Text:"+mainpageText1);
		 Thread.sleep(2000);
		 
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 String rs = RandomString.make(2);
	 
	 System.out.println(src);
	 
	        File dst = new File("F:\\Database Velocity\\scnshot\\DiwliSn\\CporMp"+rs+".png");
	        
	        FileHandler.copy(src, dst);
		 
		 
		 
		 
		
		
		
		

	}

}
