package dwailiPracsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllloginSucess {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Pratibha");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("chole");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("pratibha@123");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("P@123");
		Thread.sleep(1000);
		
		WebElement bday = driver.findElement(By.id("day"));
		 Select s = new Select(bday);
		s.selectByValue("2");
		Thread.sleep(1000);
		
		WebElement mn = driver.findElement(By.id("month"));
		
		Select m = new Select(mn);
		m.selectByVisibleText("Mar");
		Thread.sleep(1000);
		
		WebElement yr = driver.findElement(By.id("year"));
		Select yy = new Select(yr);
		yy.selectByValue("2020");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
