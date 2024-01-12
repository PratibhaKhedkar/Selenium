package opensourcesdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']") private WebElement UserName;

}
