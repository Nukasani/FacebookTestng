package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample 
{
	@Test(priority=3,enabled=false)
	public void method1()
	{
		System.out.println("this is my 1st method");	
	}
	@Test (priority=1)
	public void method3()
	{
		System.out.println("this is my 3rd method");
	}
	@Test(priority=2,invocationCount=5)
	public void method2()
	{
		System.out.println("this is my 2nd method");
	}
	@Test(priority=4)
	public void method4()
	{
		System.out.println("this is my 4rt method");
		Assert.fail();
	}
	@Test(priority=5)
	public void method5()
	{
		System.out.println("this is my 5th method");
		
	}

}
