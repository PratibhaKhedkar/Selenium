package coverfox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxhealthPlanResult {
	
	
 @FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement ResultInString;
 @FindBy(id = "plans-list") private List<WebElement> planslist;
 
 public CoverfoxhealthPlanResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
 public void resultnumber()
	{
	String test = ResultInString.getText();
	 String  ar[]=test.split(" ");
	 
	 String NumberOfResultOfString = ar[0];
	 int NumberOfResultsInInt = Integer.parseInt(NumberOfResultOfString);
	 
	 int TotalNumberPlans = planslist.size();
	 

     if(NumberOfResultsInInt==TotalNumberPlans)
     {
   	System.out.println("plans matching number of plan list");  
     }
     else
     {
   	  System.out.println("plans is not matching number of plan list");  
     }
	 
	}
 
 public void planlistwebelements()
	{
	
	}
 
}
