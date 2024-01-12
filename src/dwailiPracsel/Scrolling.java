package dwailiPracsel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/trains/create-irctc-account/");
		Thread.sleep(1000);

		
		WebElement storeRf = driver.findElement(By.xpath("//h3[text()='What to do for IRCTC new account creation on Goibibo?']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView();",storeRf);
		
		
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-2000)");
		System.out.println(storeRf);
		
		
	}

}
