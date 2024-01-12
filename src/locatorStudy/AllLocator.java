package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		//types of x-path
	//	1.x-path by attribute---->   //tagname[@attribute name = ‘attribute value’]

	//	2.x-path by text  ------>  //tagname[text() = ‘textvalue’]

	//	3x-path by contain-
	//	   a.contain with text------>//tagname[contains(text(),’textvalue’)]

	//	   b.contain with attribute----->//tagname[contains(@attribute name, ‘attribute value’)]

	//	4 x-path by index------------>(//tagname[@attribute name = ‘attribute value’] )[2]


		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.godaddy.com/");
		
		Thread.sleep(4000);
		
		//========================//	1.x-path by attribute     //=========================//
		
		//driver.findElement(By.xpath("//input[@name='searchText']")).sendKeys("Browse Domain");
		
		//===================================================================================//
		
		//========================//	x-path by text    //=========================//
		
		driver.findElement(By.xpath("//h3[class()='Web Hosting']"));
		//===================================================================================//
		
	
	}

}
