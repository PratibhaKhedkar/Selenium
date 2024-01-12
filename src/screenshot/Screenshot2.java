package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goodhousekeeping.com/life/relationships/");
		
		Thread.sleep(1000);
		
		File sourc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(sourc);
		
		RandomString rs=new RandomString();
		
		String s=RandomString.make(3);
		
		File dest = new File("F:\\Database Velocity\\scnshot\\newfile"+s+".png");
		
	    FileHandler.copy(sourc, dest);
	    
	   // driver.close();
	}

}
