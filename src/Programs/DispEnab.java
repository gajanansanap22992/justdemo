package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DispEnab 
{
public static void main(String ...args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://www.facebook.com");
	boolean b =driver.findElement(By.id("u_0_13")).isDisplayed();
	System.out.println(b);
	boolean b1 =driver.findElement(By.id("u_0_13")).isEnabled();
	System.out.println(b1);
	
	boolean b3 =driver.findElement(By.id("u_0_9")).isSelected();
	System.out.println(b3);
	driver.findElement(By.id("u_0_9")).click();
	
	
	boolean b2 =driver.findElement(By.id("u_0_9 ")).isSelected();
	System.out.println(b2);
	Thread.sleep(5000);
	driver.quit();
}
}
