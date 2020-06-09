package mavenPackage;

import org.testng.annotations.Test;

public class MatrimonyTest {
	
	@Test(groups= {"Smoke"})
	public void registerMatrimony()
	{
		
		System.out.println("Register to matrimony site");
	}

	@Test(groups= {"Regression"})
	public void logInMatrimony()
	{
		
		System.out.println("Log in to matrimony site");
	}
    
	@Test(groups= {"Sanity"})
	public void enjoyMatrimony()
	{
		
		System.out.println("Enjoy matrimony site");
	}
}
