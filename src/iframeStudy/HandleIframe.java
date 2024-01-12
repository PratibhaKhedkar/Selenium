package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		
		//switch from focus on sel
		
		driver.switchTo().frame("singleframe");
		
		Thread.sleep(1000);
		
		String st = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
		
		System.out.println("text is "+st);
		
		Thread.sleep(1000);
		
		//switch sele focus from iframe to main page
		
		driver.switchTo().defaultContent();
		
	WebElement button = driver.findElement(By.linkText("Iframe with in an Iframe"));
	System.out.println("utton is visible "+button.isDisplayed());
	 Thread.sleep(1000);
	 driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	 driver.switchTo().frame(1);
	 driver.switchTo().frame(0);
	 Thread.sleep(1000);
	 
	WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	name.sendKeys("My name is sanchi");
	name.clear();
	 Thread.sleep(1000);
	//child frame to immadete parent
	 driver.switchTo().parentFrame();
	 
	 String s2 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
	 System.out.println(s2);
	 
	 //child frame to main page
	 
	 driver.switchTo().defaultContent();
	 driver.findElement(By.linkText("Home")).click();
	}

}
