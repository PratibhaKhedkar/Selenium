package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframefirst {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		
		//Switch to main page to iframe
		
		driver.switchTo().frame("singleframe ");
		
		//getting text on frame
	  String s = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
	   
	   System.out.println(s);
	   
	   Thread.sleep(1000);
	   
	   //switch to default main page
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("newframe");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
	   Thread.sleep(1000);
	   
	   //switch to main page
	   
	   driver.switchTo().defaultContent();
	   WebElement s1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	   System.out.println(s1.isDisplayed());
	   System.out.println(s1.getText());
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	   
		
		

	}

}
