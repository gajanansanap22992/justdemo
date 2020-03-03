package Programs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	
		public static void main(String ...args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("http://www.freecrm.com");
			String path ="D:\\testImage"+System.currentTimeMillis()+".png";
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File(path));
			Thread.sleep(2000);
			File f1 = new File(path);
			File f2 =new File("D:\\img.png");
			boolean b=f1.renameTo(f2);
			System.out.println(b);
			driver.get("C:/Users/Mayur/Desktop/deomo.html");
			Thread.sleep(1500);
			File file=new File("D:\\img.png");
		
			boolean b1=file.delete();
			System.out.println(b1);
		
		
	}

}
