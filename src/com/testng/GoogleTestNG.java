package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {
	//private static final int priority = 0;
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
	}
	@Test(priority=1)
	public void gmaillink()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		System.out.println("gmaillinkclick");
		
	}
	@Test(priority=2)
	public void googleTitle()
	{
		System.out.println(driver.getTitle());
		
	}
	@Test(priority=3,groups="Mygroup")
	public void facebookTitle()
	{
		driver.navigate().to("http://www.facebook.com");	
		System.out.println(driver.getTitle());
	}
	@Test(priority=5)
	public void Title2()
	{
		//driver.navigate().to("http://www.facebook.com");	
		System.out.println("hello teat1");
	}
	@Test(priority=5,groups="First")
	public void Title5()
	{
		//driver.navigate().to("http://www.facebook.com");	
		System.out.println("hello teat1");
	}

	@AfterMethod
	public void closeUp()
	{
		try 
	{
		Thread.sleep(0);
	}
		catch(InterruptedException e)
	{
	e.getMessage();
	}
		driver.close();
	}
}
