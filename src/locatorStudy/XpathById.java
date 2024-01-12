package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathById {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/in/welcome/signup/#/mobile_conf");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("paypalAccountData_phone")).sendKeys("8806311448");
		Thread.sleep(4000);
		driver.findElement(By.id("paypalAccountData_phone")).clear();
		Thread.sleep(4000);
		driver.findElement(By.name("/paypalAccountData/phoneNumber")).sendKeys("880766559");
		
	}

}
