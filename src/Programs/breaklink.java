package Programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class breaklink {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications","headless"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gnsanap22992@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9022688916");
		driver.findElement(By.xpath("//label[contains(@id,'loginbutton')]")).click();;
		
		driver.navigate().refresh();;//new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(driver.getCurrentUrl()));
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		List<WebElement> li1=driver.findElements(By.tagName("image"));
		li.addAll(li1);
		List<WebElement> al=new ArrayList<WebElement>();
		
		for(WebElement element:li)
		{//new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementSelectionStateToBe(element, true));
			try {
			if(element.getAttribute("href")!=null)
			{
				
				//System.out.println(element.getAttribute("href"));
				al.add(element);
			}
			}
			catch(StaleElementReferenceException e) {
				new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
				//continue;
			}
			
		}
		
		System.out.println("Array "+al.size());
		String response;
		for( WebElement e:al)
		{ 
			//new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementSelectionStateToBe(e, true));
			HttpURLConnection connection=(HttpURLConnection)new URL(e.getAttribute("href")).openConnection();
			
			try {
				  response = connection.getResponseMessage();
			} catch (IOException e1) {
				 response=connection.getResponseMessage();
				
			}
			System.out.println(e.getAttribute("href")+"-->"+response);
			connection.disconnect();
		}

	}

}
