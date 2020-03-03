package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxComp 
{
	public static void main(String a[])
	{
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
       driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("google");
       List <WebElement> l=driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div[@class='sbtc']"));
 for(WebElement e:l)
 {
	 if(e.getText().contains("google scholar")) {
		 e.click();
	 }
 }
	}

}
