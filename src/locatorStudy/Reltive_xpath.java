package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reltive_xpath {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://moz.com/top500");
		
		driver.findElement(By.xpath("//div/h1[1]")).click();
		
		

	}

}
