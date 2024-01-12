package coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverfoxMain {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		
       WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.coverfox.com/");
		
		CoverfoxHomePage homepage=new CoverfoxHomePage(driver);
		  Thread.sleep(5000);
		homepage.femalebuttonclick();
		Thread.sleep(5000);
		CoverFoxHelthPlan helthplanmeb=new CoverFoxHelthPlan(driver);
		  Thread.sleep(2000);
		//helthplanmeb.Husbandclick();
		//helthplanmeb.Daughterbutn();
	     helthplanmeb.nextbtnclick();
		
	     Thread.sleep(2000);
	     
	     CoverFoxAgeMenberdetails agedetails=new CoverFoxAgeMenberdetails(driver);
	     Thread.sleep(5000);
	     agedetails.agedropdwn("25");
	    // agedetails.ageDaughterdropdwn();
	     agedetails.agenextbtn();
	     Thread.sleep(000);
	     
	     CoverFoxAdressDetail  adressdetails=new  CoverFoxAdressDetail(driver);
	     Thread.sleep(5000);
	     adressdetails.Pancodedetails("412105");
	     adressdetails.mobnumber("88888271543");
	     adressdetails.continuebtn();
	     Thread.sleep(2000);
	     CoverfoxhealthPlanResult listresultplan= new CoverfoxhealthPlanResult(driver);
	     Thread.sleep(2000);
	     listresultplan.resultnumber();
	}

}
