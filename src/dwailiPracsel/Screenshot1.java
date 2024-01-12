package dwailiPracsel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String rs=RandomString.make(4);
	System.out.println(src);
	 File dest = new File("F:\\Database Velocity\\scnshot\\DiwliSn\\"+rs+".png");
	 FileHandler.copy(src, dest);
		

	}

}
