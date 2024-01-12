package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablestudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	
	            WebElement booK_table = driver.findElement(By.name("BookTable"));
	            
	            System.out.println("no of table "+booK_table);
	    
	  List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	  
	  int numberofRows=row.size();
	  
	  System.out.println("claculate rows "+numberofRows);
	  
	  
	  List<WebElement> clnm = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
	  
	  int noOfclnm = clnm.size();
	  
	  System.out.println("no of clnm" + noOfclnm);
	    
	  for(int i=2; i<=5; i++)
	  {
		 
		  WebElement allRow = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
		  System.out.println("Row text"+allRow.getText());
	  }
	   
		
		

	}

}
