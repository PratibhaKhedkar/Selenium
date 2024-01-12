package Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_DiwaliPra {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.angelone.in/login/");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		String t= driver.getTitle();
		System.out.println(t);

	}

}
