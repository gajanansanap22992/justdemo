package Programs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathsGenius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com/");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gnsanap22992@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gajanan123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.findElement(By.xpath("//div[@id='main-nav']//span[contains(text(),'Contacts')]")).click();
	
		try
		{
			driver.findElement(By.xpath("//td[contains(text(),'mayur sapre')]//parent::tr//preceding-sibling::td//input[@name='id']")).click();
		}
		catch(ElementClickInterceptedException e)
		{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//td[contains(text(),'mayur sapre')]//parent::tr//preceding-sibling::td//input[@name='id']"))).click().build().perform();
					
		}
		driver.quit();
		

	}

}
//driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");