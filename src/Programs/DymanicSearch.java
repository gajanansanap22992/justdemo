package Programs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DymanicSearch

{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver.", "c:\\chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http:www.google.com/");
		driver.findElement(By.name("q")).sendKeys("c lang");;
		List <WebElement> l = driver.findElements(By.xpath("//ul[@jsname='erkvQe']//li/descendant::div[@class='sbl1']"));
		
		//int n=l.size();
		for (int i=0;i<l.size();)
		{
			if(l.get(i).getText().contains("c language history"))
			{
			l.get(i).click();
			break;
			}
			
			i++;
		}
		
	}

}
