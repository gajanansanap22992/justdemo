package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTables

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gnsanap22992@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gajanan123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		driver.findElement(By.xpath("//a[@class='item']/descendant::span[contains(text(),'Contacts')]")).click();
		
		//driver.findElement(By.xpath("//td[contains(text(),'mayur dattatray sapre')]/parent::tr//preceding-sibling::td//input[@name='id']")).isSelected();
	driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]]")).click();;
	 //  new WebDriverWait(driver,40).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(e)).click();
	//driver.close();
	
	}

}
