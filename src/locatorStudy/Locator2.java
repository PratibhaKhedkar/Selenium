package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Myclass");

	}

}
