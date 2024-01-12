package scrollingusingjavasceript;

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

public class ScrollingView {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(1000);
		WebElement business = driver.findElement(By.xpath("//h2[text()='BUSINESSES']"));
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", business);
	    Thread.sleep(1000);


	
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File desc = new File("F:\\Database Velocity\\scnshot\\DiwliSn\\scrolling.png");
	    FileHandler.copy(src, desc);
		
		

	}

}
