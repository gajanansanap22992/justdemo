package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class LocatoAll {
	
	public static void main(String arg[])
	{
	
	System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com/");
	//driver.findElement(new ByAll(By.name("firstname1"),By.name("lastname"),By.id("u_0_10"),By.xpath("//input[@id='u_0_v']"))).sendKeys("gajanan"); 
	driver.findElement(new ByIdOrName("u_0_q"));
	}
}
