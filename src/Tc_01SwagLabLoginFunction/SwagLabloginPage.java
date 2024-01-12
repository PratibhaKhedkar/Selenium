package Tc_01SwagLabLoginFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabloginPage {
	//POM (page object model always contains following three contents no need to write main method )
	//1 POM for 1 page : to call this method we create class(for testing purpose)
	
	//varible
	@FindBy(id = "user-name") private WebElement userNameField;
	@FindBy(id = "password") private WebElement passwordField;
	@FindBy(id = "login-button") private WebElement loginbuttonfield;
	
	//constructor
	public SwagLabloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void userName()
	{
		userNameField.sendKeys("visual_user");
	}
	public void password()
	{
		passwordField.sendKeys("secret_sauce");
	}
	public void loginfieldclick()
	{
		loginbuttonfield.click();
	}
	

}
