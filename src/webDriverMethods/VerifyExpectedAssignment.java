package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyExpectedAssignment {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		String s="https://vctcpune.com/";
		driver.get("https://vctcpune.com/");
		String s1=driver.getCurrentUrl();
		
		System.out.println(s1);
		
		
		if(s.equals(s1)) 
		{
			System.out.println("Expected and atual url are same");
		}
		else
		{
			System.out.println("expected and actual url are different");
		}
		
	}

}
