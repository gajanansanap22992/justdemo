package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {
	public static void main(String ...args) throws Exception
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		//String Before="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		//String after="]/td[2]";
		Actions action = new Actions(driver);


				
				Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//td [contains(text(),'mayur sapre')]/parent::tr//preceding-sibling::td//input[contains(@name,'id')]")).click();
		driver.findElement(By.xpath("//td [contains(text(),'ajikya aj hiwale')]/parent::tr//preceding-sibling::td//input[contains(@name,'id')]")).click();
		}
		catch(ElementClickInterceptedException e) {
			action.moveToElement(driver.findElement(By.xpath("//td [contains(text(),'mayur sapre')]/parent::tr//preceding-sibling::td//input[contains(@name,'id')]"))).click().build().perform();
			
			
			e.getMessage();}
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//td [contains(text(),'ajikya aj hiwale')]/parent::tr//preceding-sibling::td//input[contains(@name,'id')]"))).click().build().perform();
		
		
		
		//Thread.sleep(8000);	driver.close();
//		for(int i=1;i<=5;i++)
//		{
//		String name=driver.findElement(By.xpath(Before+ i +after)).getText();
//		System.out.println(name);
//		if(name.contains("mayur sapre"))
//		{
//			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]")).click();	
//		}
//		}
		Thread.sleep(4000);
		driver.quit();
		
		
}}
//ajikya aj hiwale
//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]
//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]


