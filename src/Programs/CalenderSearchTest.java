package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSearchTest {
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
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		String date="9-february-2020";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
	
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div[1]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/div[3]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[6]/div[1]/div[3]
		
		String startXpath=	"//*[@id='ui']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[";
		String endXpath="]/div[1]/div[";
		Thread.sleep(3000);
		//driver.findElement(By.xpath(startXpath+2+endXpath+6+"]")).click();;
		boolean flag=false;
		for (int rowNum=2;rowNum<=6;rowNum++)
		{
			for (int colNum=1;colNum<=7;colNum++)
			{
			String dayVal=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div["+rowNum+"]/div[1]/div[1]"+colNum+"]")).getText();
			//
			if(dayVal.contains("10")) {driver.findElement(By.xpath(startXpath+rowNum+endXpath+colNum+"]")).click();flag=true;break;}
			}
			if(flag) {break;}
		}

		//Thread.sleep(10000);
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div[7]	
	//driver.close();
		
}
}










