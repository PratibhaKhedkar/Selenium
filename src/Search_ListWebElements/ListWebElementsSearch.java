package Search_ListWebElements;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElementsSearch {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
	
		
		
		driver.findElement(By.name("q")).sendKeys("Mobile");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		
		System.out.println("=================================using for each loop============================");
		
		for(WebElement sr:searchResult)
		{
			System.out.println(sr.getText());
		}
		
		System.out.println("=================================using for loop============================");
		
		for(int i=0; i<=searchResult.size()-1; i++)
		{
			System.out.println(searchResult.get(i).getText());
		}
		
		
		

		System.out.println("=================================iterator============================");
		
		Iterator<WebElement> it = searchResult.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("=================================List iterator============================");
		
		ListIterator<WebElement> lit = searchResult.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
		
		Thread.sleep(1000);
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous().getText());
		}
		
		
			
	}

}
