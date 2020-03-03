package Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Readpropty
{  static WebDriver driver;
	public static void main(String arg[]) throws IOException, InterruptedException
	{
		Properties property = new Properties();
		FileInputStream inStream = new FileInputStream("C:\\Users\\Mayur\\eclipse-workspace\\seleniumPractice\\src\\Programs\\abc.properties");
		property.load(inStream);
		String username = property.getProperty("firstname");
		System.out.println(username);
		String age = property.getProperty("age");
		System.out.println(age);
		String browser = property.getProperty("browser");
		System.out.println(browser);
		String urll = property.getProperty("url");
		System.out.println(urll);
		
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		else {System.out.println("Browser not foiund Exception");}
		driver.get(urll);
		driver.findElement(By.xpath(property.getProperty("firstname_xpath"))).sendKeys(property.getProperty("firstname"));
	    driver.findElement(By.xpath(property.getProperty("surname_xpath"))).sendKeys(property.getProperty("surname"));
	    driver.findElement( By.xpath(property.getProperty("gmail_xpath"))).sendKeys(property.getProperty("gmail"));
	    driver.findElement(By.xpath(property.getProperty("password_xpath"))).sendKeys(property.getProperty("password"));
	    //driver.findElement(By.xpath(property.getProperty("passwor_xpath"))).sendKeys(property.getProperty("password"));
		Select select = new Select(driver.findElement(By.xpath(property.getProperty("day_xpath"))));
		select.selectByValue((property.getProperty("day")));

		Thread.sleep(5000);
		Select select1 = new Select(driver.findElement(By.xpath(property.getProperty("month_xpath"))));
		select1.selectByVisibleText((property.getProperty("month")));
		
		Select select3 = new Select(driver.findElement(By.xpath(property.getProperty("year_xpath"))));
		select3.selectByValue((property.getProperty("year")));
		driver.findElement(By.xpath("//input[contains(@id,'u_0_7')]")).click();
		driver.findElement(By.linkText("Log In")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
