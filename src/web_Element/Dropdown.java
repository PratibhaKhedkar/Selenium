package web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.id("option"));
		
		
		Select dropdown1=new Select(dropdown);
		
		/*
		dropdown1.selectByIndex(1);
		Thread.sleep(2000);
		dropdown1.selectByValue("option 2");
		Thread.sleep(1000);
		dropdown1.selectByVisibleText("Option 3");
		Thread.sleep(1000);
		
		*/
		
		List<WebElement> allAvilableOptions=dropdown1.getOptions();
		
		//List<WebElements> alloptions =driver.findElements(By.id("options"));
		
		for(WebElement option :allAvilableOptions)
		{
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option 2"))
				option.click();
			Thread.sleep(1000);
			
		}
	
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("done");
		

	}

}
