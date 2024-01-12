package web_elementss;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elements_s {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		
		Select s=new Select(dropDown);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("=====================iterator======================");
		
		List<WebElement> opt = s.getOptions();
		
		Iterator<WebElement> a = opt.iterator();
		
		while(a.hasNext())
		{
			System.out.println(a.next().getText());
		}
		System.out.println("===================for==================");
		
		for(int i=0; i<=opt.size()-1; i++)
		{
			System.out.println(opt.get(i).getText());
		}
		
		System.out.println("==================list iterator=============");
		
		ListIterator<WebElement> lit = opt.listIterator();
		           
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
			System.out.println("==========================================");
			
			List<WebElement> opt1 = s.getAllSelectedOptions();
			
			
			Iterator<WebElement> it = opt1.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next().getText());
			}
		System.out.println("======================for each===================");
		
		for(WebElement v:opt1)
		{
			System.out.println(v.getText());
		}
		
		System.out.println("===========================================");
		System.out.println(s.getFirstSelectedOption().getText());

	}

}
