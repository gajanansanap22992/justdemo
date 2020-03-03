package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup
{
	public static void main(String...arg)
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\Mayur\\Downloads\\GoogleMaps_300x250_Cities_NewLogo.html");
		}

}
