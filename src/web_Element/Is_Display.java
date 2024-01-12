package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Display {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		boolean result = driver.findElement(By.id("hide-textbox")).isDisplayed();
		
		System.out.println("Display result is " + result);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("show-textbox")).click();
		driver.findElement(By.name("show-hide")).sendKeys("hello");

	}

}
