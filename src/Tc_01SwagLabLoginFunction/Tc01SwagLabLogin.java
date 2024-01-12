package Tc_01SwagLabLoginFunction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc01SwagLabLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		
		
		SwagLabloginPage home=new SwagLabloginPage(driver);
		
		
		home.userName();
		home.password();
		home.loginfieldclick();
		
		
		SwagLabInventoryPage  InPage=new SwagLabInventoryPage (driver);
		
		InPage.Bagaddtocart();
		InPage.lightaddtocart();
		InPage.Tshirtaddtocart();
		System.out.println(InPage);
        
	}

}
