package poPup_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindoHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ntc__chip-label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ntc__chip-label'])[3]")).click();
		Thread.sleep(1000);
		
		Set<String> handles = driver.getWindowHandles();
		      Iterator<String> it = handles.iterator();
		       String focus_main = it.next();
		       String focus_tab1 = it.next();
		           String focus_tab2 = it.next();
		           String focus_tab3 = it.next();
		           //Thread.sleep(2000);
		           
		           driver.switchTo().window(focus_tab1);
		            driver.findElement(By.xpath("(//i[@class='ni-icon-unchecked'])[1]")).click();
		           System.out.println("tab1:"+driver.getTitle());
		           Thread.sleep(2000);
		           driver.switchTo().window(focus_main);
		           
		           //driver.switchTo().window(focus_tab2);
		             driver.findElement(By.xpath("(//i[@class='ni-icon-unchecked'])[44]")).click();
		             driver.switchTo().window(focus_tab2);
		           System.out.println("tab2:"+driver.getTitle());
		           Thread.sleep(3000);
		           driver.switchTo().window(focus_main);
		           
		          
		            String tab_3 = driver.findElement(By.linkText("(//a[@class='nI-gNb-menuItems__anchorDropdown'])[3]")).getText();
		            driver.switchTo().window(focus_tab3);
		            System.out.println("tab3:"+tab_3);
		            Thread.sleep(500);
		            driver.switchTo().window(focus_main);
		            
		            driver.switchTo().window(focus_main);
		            driver.findElement(By.id("login_Layer")).click();
		            driver.switchTo().window(focus_main);
		            System.out.println("mainPage:"+focus_main);
		           
		           
	}

}
