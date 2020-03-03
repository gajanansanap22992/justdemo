package Programs;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile 
{
public static void main(String[] args) throws Exception
{
	
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Mayur\\eclipse-workspace\\seleniumPractice\\src\\Programs\\Config.properties");
	p.load(fis);
	System.out.println(p.getProperty("name"));
	System.out.println(p.getProperty("age"));
	p.setProperty("browser", "Chrome");
	p.setProperty("url", "http://www.google.com/");
	p.store(new FileWriter("C:\\Users\\Mayur\\eclipse-workspace\\seleniumPractice\\src\\Programs\\Config.properties"), null);
	
	String BrowserName=p.getProperty("browser");
	if(BrowserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	else {System.out.println("notfound");}
}
}
