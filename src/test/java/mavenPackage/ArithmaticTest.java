package mavenPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmaticTest {
	
	int x = 100;
	int y=5;
	int p;
	@Test(groups= {"Smoke"})
	public void add()
	{
		
		p=x+y;
		
		System.out.println("Addition is : "+p);
	}
	@Test(enabled=false)
	public void sub()
	{
		
		p=x-y;
		
		System.out.println("Substraction is : "+p);
	}
	
	@Test(dependsOnMethods= {"add"})
	public void mult()
	{
		
		p=x*y;
		
		System.out.println("Multiplication is : "+p);
	}
	
	@Test(dependsOnMethods= {"mult"})
	public void div()
	{
		
		p=100%5;
		
		System.out.println("Division is : "+p);
		
	    
	}
}
