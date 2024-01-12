package Pratices;

//import org.apache.commons.math3.geometry.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebDE {

	public static void main(String[] args) throws InterruptedException {
		//1.open Chrome
		WebDriver driver=new ChromeDriver();
		//2.open google page
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//3.Display title of page as output
		System.out.println("1. "+driver.getTitle());
		//4.open feacebook
		driver.get("https://www.facebook.com/login/");
		//get url of current page
		System.out.println("2. "+driver.getCurrentUrl());
		Thread.sleep(2000);
		//5.Open myntra.com
		driver.navigate().to("https://www.myntra.com/");
		//6. go back to facebook
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/login/");
		//7. facebook page is displayed or not
		System.out.println("3. "+driver.getTitle());
		String s1 = "https://www.facebook.com/";
		String s2 = driver.getCurrentUrl();
		if(s1.equals(s2))
		{
			System.out.println("4. facebook pge displayed sucessfully...");
		}
		//8. change the position of the page
		Point pt = new Point(100, 500);
		driver.manage().window().setPosition(pt);
		//9.change the size of webpage
		Thread.sleep(1000);
		Dimension d = new Dimension(10, 1000);
		driver.manage().window().setSize(d);
		//10. maximum the browser
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//11.go to myntra.com
		driver.navigate().to("https://www.myntra.com/");
		String s3 = "https://www.myntra.com/";
		String s4 = driver.getCurrentUrl();
		if(s3.equals(s4))
		{
		System.out.println("5. myntra page displayesd sucessfully");
		}
		//12. refresh the browser
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		

	}

}
