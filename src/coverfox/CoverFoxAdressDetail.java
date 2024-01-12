package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAdressDetail {
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement Pancode;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobno;
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement continuebtn;


	
	public CoverFoxAdressDetail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Pancodedetails(String  Pincode)
	{
		Pancode.sendKeys(Pincode);
	}
	public void mobnumber(String mobnumber)
	{
		mobno.sendKeys(mobnumber);
	}
	public void continuebtn()
	{
		continuebtn.click();;
	}
}
