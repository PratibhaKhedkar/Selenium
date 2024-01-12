package poPup_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionClassHandle {

	public static void main(String[] args) {
		
		
		ChromeOptions opt=new ChromeOptions();
		ChromeOptions headless=opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(headless);
		driver.get("https://www.ajio.com/");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
	}

}
