package Dimentionstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionSetsizeOfBrawser {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/mlpage/5-years-baby-girl-birthday-dresses/34974");
		Thread.sleep(1000);
		
            Dimension diml = new Dimension(800,600);
            driver.manage().window().setSize(diml);
            Thread.sleep(1000);
            
            Dimension diml1=new Dimension(500,800);
            driver.manage().window().setSize(diml1);
		
		

	}

}
