package AllLocatorWaitImplicite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FuentSynWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://discoveryplus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("mobileNumber")).sendKeys("978986543");
		WebElement element = driver.findElement(By.xpath(""));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(5));
		
		
		
		
		
		
		
		
		

	}

}
