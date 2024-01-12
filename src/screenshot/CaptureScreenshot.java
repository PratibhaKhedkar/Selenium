package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en");
		
		Thread.sleep(1000);
		
		File sorc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		 
		 File trg=new File("F:\\Database Velocity\\scnshot\\homepage.png");
		 
	FileHandler.copy(sorc, trg);
		 
		 
		
		
	
		
		

	}

}
