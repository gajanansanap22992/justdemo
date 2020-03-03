package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
      driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
      driver.findElement(By.xpath("//button[contains(@id,'btndropdown')]")).click();;
     List <WebElement> l=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));
     System.out.println(l.size());
     for(WebElement ll:l)
     {
    	System.out.println(ll.getText());
    	  if(ll.getText().contains("CSS"))
    	  {
    		ll.click();
    		//break;
    	  }
     }
    // System.out.println(l.size());
     for(Object ll:l)
     {
    	 WebElement e = (WebElement)ll;
    	
    	 // if(e.getText().contains("CSS"))
    	  {
    		e.click();
    		break;
    	  }//
     }
    // System.out.println(l.size());
     
	}

}
