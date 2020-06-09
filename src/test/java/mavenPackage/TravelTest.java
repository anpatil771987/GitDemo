package mavenPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TravelTest {
	
	@Test(groups= {"Smoke"})
	public void TravelRegister()
	{
		
		System.out.println("Register to travel site");
	}
    
	@Parameters ({"url","browser"})
	@Test(groups= {"Regression"})
	public void TravelLogIn(String url,String browser)
	{
		
		System.out.println("Log in to travel site with url --->"+url+"and browser -->"+browser);
	}

	@Test(groups= {"Sanity"})
	public void EnjoyTravelling()
	{
		
		System.out.println("Enjoy Travelling");
	}

}
