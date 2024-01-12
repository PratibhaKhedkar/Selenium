package dwailiPracsel;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(1000);
		
		WebElement src = driver.findElement(By.xpath("(//img[@id='angular'])[1]"));
		Thread.sleep(1000);
		WebElement desc = driver.findElement(By.xpath("//div[@id='droparea']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, desc).build().perform();
		
		
		
		
		

	}

}
