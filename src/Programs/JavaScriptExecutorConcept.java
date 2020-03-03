package Programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept 
{
	public static void main(String ...a) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	     
	       WebDriver driver=new ChromeDriver();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	      	       
		   WebElement locator=driver.findElement(By.xpath("//label[@id='loginbutton']"));
	      	       
	       
	            
	   
	    
	     
	     
	     
	}

}
