import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_interview {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//input[@id='search_button']")).click();
	
		

	}

}
