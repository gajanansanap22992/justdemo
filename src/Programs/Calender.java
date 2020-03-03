package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender
{ 
	public static void main(String[] arg)
	{
	
	System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.spicejet.com/default.aspx");
	String date="05-09-2020";

	WebElement element=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
	WebElement element1=driver.findElement(By.id("ctl00_mainContent_txt_Todate"));
	jsDate(driver,element,date);
	jsDate(driver,element1,"22-12-2020");///ctl00_mainContent_view_date2
	}
	static void jsDate(WebDriver driver,WebElement element,String date)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute( 'value','"+date+"');", element);
	}
	
	
}