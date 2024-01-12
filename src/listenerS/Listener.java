package listenerS;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String TCName = result.getName();
		Reporter.log("Tc "+TCName+" "+" completed is successfull  ", true );
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String TCName = result.getName();
		Reporter.log("Tc "+TCName+" "+ "is Skipped , please check depends on method  ", true );
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Tc" + result.getName() +" is failed Please chech again  ", true );
	}
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Tc" + result.getName() +"is excution started  ", true );
	}
}
