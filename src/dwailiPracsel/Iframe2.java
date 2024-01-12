package dwailiPracsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/iframe");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		WebElement s = driver.findElement(By.xpath("//h2[contains(@class,'elementor-heading-title elementor-size-default')]"));
		System.out.println("text frame : index=0");
		System.out.println(s);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		String s1 = driver.findElement(By.xpath("//h1[text()='Alert and PopUp']")).getText();
		System.out.println("text frame : index=1");
		System.out.println(s1);
		driver.switchTo().defaultContent();
		System.out.println("operation on frame : index=2");
		driver.switchTo().frame(2);
		WebElement ele = driver.findElement(By.xpath("//input[@id='vfb-31-2']"));
		boolean b = ele.isSelected();
		System.out.println(b);
		ele.click();
		boolean b1 = ele.isSelected();
		System.out.println(b1);
		System.out.println("play video in inner frame: index 0");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@title='Play']")).click();
		
		
		
		

	}

}
