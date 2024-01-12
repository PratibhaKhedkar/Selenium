package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SectionScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.fayonkids.com/collections/girls-birthday");
		 
		 Thread.sleep(1000);
		 
		 WebElement section = driver.findElement(By.xpath("//footer[@class='footer color-background-1 gradient section-sections--16760402903296__footer-padding']"));
		 
		 File sr = section.getScreenshotAs(OutputType.FILE);
		 
		 File drg=new File("F:\\Database Velocity\\scnshot\\m");
		 
		 FileHandler.copy(sr, drg);
		 
		 driver.close();
		
		 
		
		

	}

}
