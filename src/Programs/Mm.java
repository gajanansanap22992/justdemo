package Programs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mm
	{
	
	public static void screenShot(WebDriver driver,String  path) 
	{
		File destination = new File(path);
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
		FileUtils.copyFile(source, destination);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}	
		
	
	public static void explicitlyWait(WebDriver driver,int time,WebElement webElement) 
	{
	WebDriverWait w = new WebDriverWait(driver,time);
	w.ignoring(StaleElementReferenceException.class);
	w.until(ExpectedConditions.elementToBeClickable(webElement));
	try{Thread.sleep(2000);}catch(Exception e) {e.getMessage();}
	webElement.click();
	}
	public static WebDriver start() 
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	

}