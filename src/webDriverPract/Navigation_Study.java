package webDriverPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
           driver.get("https://www.accessify.com/d/newtours.demoaut.com");
           Thread.sleep(1000);
       
         System.out.println(driver.getTitle());  
           
           
           
           driver.manage().window().maximize();
           
           Thread.sleep(1000);
           
           driver.navigate().to("https://www.facebook.com/");
           System.out.println(driver.getTitle());  
           
           driver.navigate().back();
           System.out.println(driver.getTitle());  
           
           driver.navigate().forward();
           System.out.println(driver.getTitle());  
           
           driver.navigate().refresh();
           
           //driver.close();
           
	}

}
