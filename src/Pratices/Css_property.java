package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_property {
	
	WebDriver driver;
	

	public void LunchBrower()
	{
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
	    driver=new ChromeDriver();
	}
	public void takesscreen() throws InterruptedException 
	{
		driver.findElement(By.id("u_0_0_")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("u_i_b_")).sendKeys("myfirstName");
	    driver.findElement(By.id("u_i_d_")).sendKeys("mylastName");
	    
	    Thread.sleep(1000);
	    
	}
	public void getCssProp() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("email")).getCssValue("font-size"));
	}
	
	

	public static void main(String[] args) {
		
		Css_property cs=new Css_property();
		cs.LunchBrower();
		cs.getCssProp();
		
	}
	
	

}
