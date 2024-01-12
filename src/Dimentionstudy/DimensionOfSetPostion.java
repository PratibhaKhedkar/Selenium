package Dimentionstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionOfSetPostion {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/mlpage/5-years-baby-girl-birthday-dresses/34974");
		Thread.sleep(1000);
		
            Point diml = new Point(400,10);
            driver.manage().window().setPosition(diml);
            Thread.sleep(1000);
            
            Point diml1=new Point(300,20);
            driver.manage().window().setPosition(diml1);
		
		

	}

}
