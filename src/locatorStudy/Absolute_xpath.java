package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Absolute_xpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://moz.com/top500");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/h1[1]")).click();
		//driver.findelement(RelativeLocator.with(By.tagName("Button")).near(null));
	}

}
