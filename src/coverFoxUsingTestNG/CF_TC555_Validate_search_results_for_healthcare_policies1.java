package coverFoxUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHealthPlanResultsPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;

public class CF_TC555_Validate_search_results_for_healthcare_policies1 {
	
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	@BeforeClass
	public void launchBrowser()
	{
	driver= new ChromeDriver();
	home= new CoverFoxHomePage(driver);
	healthPlan= new CoverFoxHealthPlanPage(driver);
	addressDetails= new CoverFoxAddressDetailsPage(driver);
	memberDetails= new CoverFoxMemberDetailsPage(driver);
	result= new CoverFoxHealthPlanResultsPage(driver);
	Reporter.log("Opening browser ", true);
	driver.get("https://www.coverfox.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@BeforeMethod
	public void enterMemeberDeatils() throws InterruptedException
	{
	Reporter.log("clicking on gender button ", true);
	home.clickOnMaleButton();
	Thread.sleep(1000);
	Reporter.log("clicking on next button ", true);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Handeling age drop down ", true);

	memberDetails.hanldeAgeDropDown("28");
	Reporter.log("Clicking on next button ", true);
	memberDetails.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Entering pin code ",true);
	addressDetails.enterPinCode("411046");
	Reporter.log("Entering mobile num ",true);
	addressDetails.enterMobNum("8888888888");
	Reporter.log("Clicking on continue button ", true);
	addressDetails.clickOnContinueButton();
	Thread.sleep(1000);
	}

	@Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException
	{
	Thread.sleep(5000);
	Reporter.log("Fetching number of results from text ", true);
	int textResult = result.availablePlanNumberFromText();
	Thread.sleep(7000);
	Reporter.log("Fetching number of results from Banners ", true);
	int bannerResult = result.availablePlanNumberFromBanners();
	Thread.sleep(1000);
	Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed");
			Reporter.log("TC is passed ", true);
	Reporter.log("TC is passed ", true);

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Reporter.log("Closing browser ", true);
	Thread.sleep(3000);
	driver.close();
	}

}
