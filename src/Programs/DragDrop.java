package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] a)
	{
		WebDriver driver =Mm.start();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement
		(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
	}
	

}
