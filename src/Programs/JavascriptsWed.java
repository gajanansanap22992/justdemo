package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptsWed {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
        driver.get("http://www.facebook.com");
        
       WebElement element =driver.findElement(By.xpath("//label[@id='loginbutton']"));
       
       // flash(driver,element);  
       // drawBorder(driver,element);
      //  jsalert(driver,"this is the error");
                jsClick(driver,element);
                Thread.sleep(3000);
        jsRefresh(driver);
         Thread.sleep(8000);
         driver.quit();
        

	}
		
	static void flash(WebDriver driver,WebElement element)
	{
		//JavascriptExecutor js =(JavascriptExecutor) ((JavaScriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<=20;i++) 
		{
		changeColor(driver,element,"rgb(0,255,200)");
		changeColor(driver,element,bgcolor);
		}
		
	}
	static void changeColor(WebDriver driver,WebElement element,String color)
	{
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try {Thread.sleep(20);}catch(InterruptedException e) {System.out.println(e.getMessage());}
	}
	static void drawBorder(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border ='5px solid red'",element);
		
	}
	static void jsalert(WebDriver driver,String message)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	static void jsClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()",element);
	}
	static void jsRefresh(WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















