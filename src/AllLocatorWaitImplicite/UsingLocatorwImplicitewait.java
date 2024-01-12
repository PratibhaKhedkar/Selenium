package AllLocatorWaitImplicite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorwImplicitewait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Pratibha");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("inputPassword")).sendKeys("Pra@1342");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String s = driver.findElement(By.cssSelector("p.error")).getText();
		//Thread.sleep(1000);
		System.out.println(s);
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sonu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Sonu@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("880922558");
		Thread.sleep(1000);
		///////////////////////////////
         driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
         Thread.sleep(1000);
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());  
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/button[1]")).click();
       Thread.sleep(1000);
       
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sanchi");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sanchi3478&5");
       Thread.sleep(1000);
       driver.findElement(By.id("chkboxOne")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
       
       
	}

}
