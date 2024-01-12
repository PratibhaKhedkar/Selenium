package Search_ListWebElements;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ListElementSingle {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
	
	
		for(WebElement ele:searchResult)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("honda elevate"))
			{
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//a[contains(text(),'Images')])[1]")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		 String filename = String.valueOf(new Date().toString().replace(":"," -"))+".png";
		 FileHandler.copy(src, new File("F:\\Database Velocity\\scnshot\\DiwliSn\\abcc"+filename));
		 Thread.sleep(1000);
		// driver.quit();	 
		
		
	}

}
