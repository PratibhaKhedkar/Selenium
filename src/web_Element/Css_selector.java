package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click(); 
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='First name']")).sendKeys("vani");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("chole");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_h_g_')]")).sendKeys("8806522558");
		
		//Thread.sleep(1000);
		

	}

}
