package webDriverPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demo.guru99.com/test/newtours/");//Get method use open the url
		
		System.out.println(driver.getTitle());//retrun the title of the page
	
		
		System.out.println(driver.getCurrentUrl());//retrun the url of the page
		
		
		//driver.findElement(By.xpath("")).getText();

		//driver.close();
		
		//driver.quit();
	}

}
