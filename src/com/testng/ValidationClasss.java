package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidationClasss 
      {
			WebDriver driver;
		
	@BeforeMethod
	public void getTitle()
	{
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");		
	driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	}
	@Test
	public void Test1()
	{
		String Title =driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Googl", Title,"not match");
	}
	
	@Test
	public void Test()
	{
		String Title =driver.getTitle();
		System.out.println(Title);
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b, "pass my");
	}
	@AfterMethod
	public void m()
	{
		driver.close();
	}
	

}
