package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
      driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
      driver.findElement(By.xpath("//button[contains(@id,'btnDropdownDemo')]")).click();
      List <WebElement> l=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
      for(WebElement e:l)
      {
    	  if(e.getText().contains("CSS")) {
    	  e.click();break;
      }}
      
      
      
      
      
      
      
      
      
      
      
   try {   Thread.sleep(20000);
   }
   catch(InterruptedException e) {
   }
    driver.close();
	}

}
