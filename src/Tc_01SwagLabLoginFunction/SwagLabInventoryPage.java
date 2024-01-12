package Tc_01SwagLabLoginFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage {
	
	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement  addtocartbag;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt") private WebElement addtocartshirt;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")private WebElement addtocartlight;
	
	public SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Bagaddtocart()
	{
		addtocartbag.click();
	}
	public void Tshirtaddtocart()
	{
		addtocartshirt.click();
	}
	public void lightaddtocart()
	{
		addtocartlight.click();
	}
	
}
