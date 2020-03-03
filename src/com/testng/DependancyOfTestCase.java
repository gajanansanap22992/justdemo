package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependancyOfTestCase
{
	@BeforeMethod
	public void startUp()
	{
		System.out.println("before method");
	}
	@Test
	public void check()
	{
		System.out.println("check");
	}
	@Test(dependsOnMethods="check")
	public void check1()
	{
		System.out.println("check1");
	}
	
	@AfterMethod
	public void endUp()
	{
		System.out.println("After method");
	}
	
}
