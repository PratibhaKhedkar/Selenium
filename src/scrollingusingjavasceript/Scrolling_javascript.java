package scrollingusingjavasceript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_javascript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");

	}

}
