package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSlider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ')]"));
		
		Actions action =new Actions(driver);
		
		action.scrollToElement(slider).scrollByAmount(0, 100).perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, -30, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, 150, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, -50, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, 250, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, -300, 0).build().perform();

	}

}
