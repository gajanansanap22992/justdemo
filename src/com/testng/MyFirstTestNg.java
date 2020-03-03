package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNg {
	@BeforeSuite
	public void setup()
	{
	System.out.println("Setup property for Chrome");	
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch browser");
		
	}
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("enetr url");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void titleTest()
	{
		System.out.println("get title");
	}
	@Test
	public void titleTest2()
	{
		System.out.println("get title2");
	}
	@Test
	public void titleTest3()
	{
		System.out.println("get title3");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	@AfterTest
	public void deletecookie()
	{
		System.out.println("coockies");
	}
	@AfterClass
	public void closeDriver()
	{
		System.out.println("close");
	}
	@AfterSuite
	public void generatereport()
	{
		System.out.println("report Generation");
	}
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


