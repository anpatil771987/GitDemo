package mavenPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CricketTest {
	
	@Parameters({"url"})
	@Test(groups= {"Smoke"})
	public void CricketRegister(String url)
	{
		
		System.out.println("Register to Cricket site using URL --->" +url);
	}

	@Test(groups= {"Regression"})
	public void TravelLogIn()
	{
		
		System.out.println("Log in to Cricket site");
	}

	@Test(groups= {"Sanity"})
	public void EnjoyTravelling()
	{
		
		System.out.println("Enjoy playing cricket");
	}

}
