package Programs;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshots {

	private static final Function ExpectedConditions = null;

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.get("http://www.facebook.com");
	    
	    
	   screenShot(driver,"C:\\Users\\Mayur\\eclipse-workspace\\seleniumPractice\\Screenshotsss\\"+System.currentTimeMillis() +"a.png");
      // explicitlyWait(driver,20,driver.findElement(By.linkText("Log In")));
		
	}
static	void screenShot(WebDriver driver,String path) throws IOException
{
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
FileUtils.copyFile(source,new File(path));
}

//static void explicitlyWait(WebDriver driver,int time, WebElement element) 
//{
//new	WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class).until(((Object) ExpectedConditions).elementToBeClickable(element));
//}

}

