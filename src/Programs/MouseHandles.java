package Programs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseHandles
{
	public static void main(String []args)
	{
		WebDriver driver=Mm.start();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'Google apps')]"))).click().build().perform();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[contains(@pid,'49')]")).click();*/
		List<WebElement> l=driver.findElements(By.tagName("iframe"));
		Iterator<WebElement> i = l.iterator();
		System.out.println(l.size());
		int k=0;
		for(;i.hasNext();)
		{
			System.out.println("Frame no "+k+""+i.next().getText());
			k++;
		}
		for(int j=0;j<l.size();j++)
		{
			driver.switchTo().frame(j);
		}
		}
	}


