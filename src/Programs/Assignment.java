package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {		
		
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


      driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abcd");
      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bcdf");
      driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("bcd12345634f");
      driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("bcAAAAAd12345634f@");
      driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("bcAAAAAd12345634f@");
      driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
      driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9022688916");
     try {
      driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
     }
     catch(Exception e)
     {System.out.println(e.getMessage());
     driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
     }
    //  new WebDriverWait (driver,20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//span[contains(text(),'Next')]"))));
     
     // driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	}

}
