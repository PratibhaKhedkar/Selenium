package coverfox;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxAgeMenberdetails {
	
	@FindBy(id = "Age-You") private WebElement agedropdn;
	//@FindBy(id = "Age-Daughter-0") private WebElement childdrop;
	@FindBy(xpath = "//div[text()='Next']") private WebElement agenextbtn;


	
	
	public CoverFoxAgeMenberdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void agedropdwn(String age)
	{
		
    	Select s=new Select(agedropdn);
    	s.selectByValue(age);
		
	}
//	public void ageDaughterdropdwn()
//	{
//		childdrop.click();
//	}
	public void agenextbtn()
	{
		agenextbtn.click();
	}
}
