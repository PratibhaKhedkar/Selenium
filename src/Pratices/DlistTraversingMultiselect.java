package Pratices;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DlistTraversingMultiselect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement cf = driver.findElement(By.id("cars"));
		 Select s=new Select(cf);
		 Thread.sleep(1000);
		 s.selectByIndex(3);
		 Thread.sleep(1000);
		 s.selectByValue("saab");
		 Thread.sleep(1000);
		 s.selectByVisibleText("Volvo");	 
		 Thread.sleep(1000);
		 System.out.println(s.getFirstSelectedOption().getText());
		 
		 System.out.println("=====================for loop================");
		 List<WebElement> list = s.getOptions();
		 for(int i=0; i<=list.size()-1; i++)
		 {
			 System.out.println(list.get(i).getText());
		 }
		 
		 System.out.println("==============for each loop=================");
		List<WebElement> list1 = s.getOptions();
		 for(WebElement ss:list1)
		 {
			 System.out.println(ss.getText());
		 }
		 System.out.println("===================iterator===============");
		 Iterator<WebElement> li = list1.iterator();
		 while(li.hasNext())
		 {
			 System.out.println(li.next().getText());
		 }
		 System.out.println("=============list iterator (forward)==========");
		ListIterator<WebElement> lil = list1.listIterator();
		while(lil.hasNext())
		{
			System.out.println(lil.next().getText());
		}
		 System.out.println("===================list iterator (backword)===============");
		 
		 while(lil.hasPrevious())
		 {
			 System.out.println(lil.previous().getText());
		 }
		 
		 

	}

}
