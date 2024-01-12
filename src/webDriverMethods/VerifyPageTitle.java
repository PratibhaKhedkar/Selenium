package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedResult="velocity | best software Training center";
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		
		String actualResult= driver.getTitle();
		
		if(expectedResult.equals(actualResult)) 
		{
			System.out.println("tc pass");
		}
		else
		{
			System.out.println("tc failed");
		}
		
		
	}

}
