package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement sourcepage = driver.findElement(By.id("draggable"));
		
		Thread.sleep(1000);
		
		WebElement desc = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		
		Actions s=new Actions(driver);
		Thread.sleep(1000);
		s.dragAndDrop(sourcepage, desc).build().perform();
	}

}
