package Pratices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrolldownScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  Thread.sleep(2000);
	  
	  
	  WebElement storescren = driver.findElement(By.xpath("(//img[@src='images/banner2.png'])[1]"));
	  Thread.sleep(2000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,700)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-2000)");
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js1= (JavascriptExecutor)driver;
	  
	  js1.executeScript("arguments[0].scrollIntoView();", storescren);
	  
	  RandomString rs = new RandomString();
	  
	  String store=rs.make(10);
	  
	  
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest = new File("F:\\Database Velocity\\scnshot\\ddd\\rulescreen"+store+".png");
	  
	  FileHandler.copy(source, dest);
	  
	  
	  

	}

}
