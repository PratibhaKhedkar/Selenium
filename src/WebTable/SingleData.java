package WebTable;

//import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleData {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://testautomationpractice.blogspot.com/");
		//Scroll
		WebElement business = driver.findElement(By.xpath("//h2[text()='Web Table']"));
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", business);
	    Thread.sleep(1000);
//
		//to print the single data
		WebElement data_1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]"));
		System.out.println(data_1.getText());
		System.out.println("=========================================");
        
		//to get header row
		
		List<WebElement> header_row = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		for(WebElement hr:header_row)
		{
			System.out.print(hr.getText()+" ");
		}
		System.out.println();
		System.out.println("========================================");
		
		//to get row
		
		List<WebElement> Row2_data = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
		for(WebElement r2:Row2_data)
		{
		System.out.print(r2.getText()+" ");
		}
		System.out.println("");
		System.out.println("===========================================");
		
		//to get column
		for(int i=2; i<=7; i++)
		{
			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
			System.out.println(data.getText());
		}

	}

}
