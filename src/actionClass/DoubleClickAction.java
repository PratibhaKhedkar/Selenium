package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement rightButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		//Thread.sleep(1000);
		
		Actions s=new Actions(driver);
		
		s.doubleClick(rightButton).perform();

	}

}
