package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDynamic {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("c language");
		List <WebElement> l=driver.findElements(By.xpath("//ul[@jsname='erkvQe']//li/descendant::div[@class='sbl1']"));
		String str="c language book";
		for(WebElement e:l)
		{
			if(e.getText().equals(str))
			{
				e.click();
			}
		}
	}

}
