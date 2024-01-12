package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHelthPlan {
	
	@FindBy(xpath = "//div[@class='ms-title'])[2]") private WebElement Husbandimg;
	//@FindBy(xpath = "(//div[@class='ms-title'])[3]") private WebElement Daughter;
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement nextbtn;
	
	
	public CoverFoxHelthPlan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Husbandclick()
	{
		Husbandimg.click();
	}
//	public void Daughterbutn()
//	{
//		Daughter.click();
//	}
	
	public void nextbtnclick()
	{
		nextbtn.click();
	}

}
