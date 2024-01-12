package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_dropdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
         driver.manage().window().maximize();
         
         driver.get("https://www.amazon.in");
         
         Thread.sleep(1000);
         
         WebElement r = driver.findElement(By.id("//select[@id='searchDropdownBox']"));
         
         Select s1=new Select(r);
         
         s1.selectByIndex(3);
         Thread.sleep(1000);
      //   s1.selectByValue("search-alias=mobile-apps");
         
       //  Thread.sleep(1000);
         s1.selectByVisibleText("Books");
        // Thread.sleep(1000);
	}

}
