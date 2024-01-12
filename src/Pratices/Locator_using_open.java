package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_using_open {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/trains/create-irctc-account/");
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pratibha");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(@class,'cm__sprite calIcn')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("inptFld__inpWrap withBorderBtm paddingB8")).click();
       // Thread.sleep(1000);
        //driver.findElement(By.xpath("//li[text()='Apr']")).click();
       // Thread.sleep(1000);
        
        
        
	}

}
