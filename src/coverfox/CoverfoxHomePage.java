package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage {
	
	@FindBy(xpath = "//div[@class='w--radio__option radio_selected']") private WebElement femalebutton;
	
	
	
	public CoverfoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void  femalebuttonclick()
	{
		femalebutton.click();
	}
}
