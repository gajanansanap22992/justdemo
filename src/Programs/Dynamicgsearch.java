package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicgsearch {

	
		public static void main(String ...args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("http://www.google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi' ]")).sendKeys("java");
			//=driver.findElements(By.xpath("ul[@jsname='erkvQe']//li"));
					
			List <WebElement> l=driver.findElements(By.xpath("//ul[@jsname='erkvQe']//li/descendant::div[@class='sbl1']"));
			System.out.println(l.size());
			for(int i=0;i<l.size();)
			{
			if(l.get(i).getText().contains("javatpoint"))
			{l.get(i).click();
			break;}i++;
			}

	}

}
