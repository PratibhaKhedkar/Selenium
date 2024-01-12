package Dimentionstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//get default position of browser
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		Thread.sleep(1000);
		
		//set postion of browser
		Point p = new Point(100,90);
		driver.manage().window().setPosition(p);
		
		//get default size of browser
		  Dimension defaultSize = driver.manage().window().getSize();
		  System.out.println(defaultSize);
		  Thread.sleep(1000);
		  
		  //set size of browser
		  Dimension d = new Dimension(100,20);
		  driver.manage().window().setSize(d);
		
		
		

	}

}
