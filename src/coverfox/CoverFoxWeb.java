package coverfox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxWeb {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.coverfox.com/");
		
		driver.findElement(By.xpath("//div[@class='w--radio__option ']")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//div[text()='Mobile ']")).sendKeys("8888271642");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ms-title'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ms-title'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ms-title'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ms-action'])[2]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='next-btn']")).click();
    	Thread.sleep(1000);
    	  
    	
    	WebElement ageselect = driver.findElement(By.id("Age-Spouse"));
    	Select s=new Select(ageselect);
    	s.selectByValue("40y");
    	Thread.sleep(1000);
    	WebElement ageselect1 = driver.findElement(By.id("Age-Daughter-0"));
    	Select s1=new Select(ageselect1);
    	s1.selectByValue("19y");
    	
    	WebElement ageselect2 = driver.findElement(By.id("Age-Daughter-1"));
    	Select s2=new Select(ageselect2);
    	s2.selectByValue("18y");
    	
    	
    	 driver.findElement(By.xpath("//div[@class='next-btn']")).click();
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("412105");
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8888271642");
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("//div[@class='next-btn']")).click();
     	Thread.sleep(1000);
     	
     	List<WebElement> planelist = driver.findElements(By.id("plans-list"));
     	int totalsuggestedPlans = planelist.size();
     	System.out.println("Total sug planes are:- " + planelist.size());
     	
      String matchingplan = driver.findElement(By.xpath("//div[contains(text(),'matching Health')]")).getText();
      System.out.println("text display: " +matchingplan);
      
      String[] result = matchingplan.split(" ");
      
      String matchingNumberInString = result[0];
      
      int matchingNumberInInt = Integer.parseInt(matchingNumberInString);
      
      if(totalsuggestedPlans==matchingNumberInInt)
      {
    	System.out.println("plans matching number of plan list");  
      }
      else
      {
    	  System.out.println("plans is not matching number of plan list");  
      }
      Thread.sleep(1000);
      
      driver.findElement(By.xpath("(//div[@class='filter-sec'])[3]//div[@class='fc-filter']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//span[text()='Aditya Birla Health Insurance']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//span[text()='National Insurance Company']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@class='apply-sec']")).click();
    
      
     	
     	
	}

}

