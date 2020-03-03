package Programs;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) //throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.linkText("Come & Go Test")).click();
		Set<String> handler =driver.getWindowHandles();
		Iterator<String> i =handler.iterator();
		String parentWindowId = i.next();
		System.out.println(parentWindowId);
		String childWindowId = i.next();
		System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		try{Thread.sleep(3000);}
		catch(InterruptedException e) {System.out.println(e.getMessage());}
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		

	}

}
