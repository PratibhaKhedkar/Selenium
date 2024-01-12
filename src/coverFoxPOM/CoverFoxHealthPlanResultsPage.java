package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlanResultsPage {
	
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement resultsInString;
	@FindBy(id = "plans-list") private List<WebElement> planList;
	
	@FindBy(xpath = "//div[text()='Sort Plans']") private WebElement sortplanfiled;
	public CoverFoxHealthPlanResultsPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public int availablePlanNumberFromText()
	{
	String test = resultsInString.getText();
	//49 matching Health Insurance Plans
	String ar[]=test.split(" ");
	//ar[]={"49" "matching" "Health" "Insurance" "Plans"}

	String numberOfResultsInString = ar[0];//49-->String
	//convert String to integer
	int numberOfResultsInInt =

	Integer.parseInt(numberOfResultsInString);//49-->in number(int)

	return numberOfResultsInInt;
	}

	public int availablePlanNumberFromBanners()
	{
	int totalNumberOfPlans = planList.size();
	return totalNumberOfPlans;

	}
	public boolean sortplanfiledPrescency()
	{
		Reporter.log("ValidingsortPlan sortplanfiledPrescency", true);
		boolean result = sortplanfiled.isDisplayed();
		 return result;
	}

}
