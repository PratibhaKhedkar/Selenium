package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_txt_ele {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://byjus.com/");
		Thread.sleep(3000);
		
		String expresult ="Book your Free Session";
		
		String actualresult=driver.findElement(By.className("trial-form-title")).getText();
		
		System.out.println(actualresult);
		
		if(expresult.equals(actualresult)) 
		{
			System.out.println("Text is matching and Test case is passed");
		}
		else 
		{
			System.out.println("Text is not matching and Test case is failed");
		}
	}

}
