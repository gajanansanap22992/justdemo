package Programs;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DownloadFile {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("1.jpg")).click();
		
		
		//Actions action =new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//button[@class='c-glyph glyph-cancel' and @aria-label='रद्द करें']"))).click().build().perform();
		
		

	}

}
