package mavenPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	public void onTestFailure(ITestResult result)
	
	{
		
		System.out.println("Failed method is ---"+result.getName());
		
	}
	
}