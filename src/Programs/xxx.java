package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xxx {
	@Test
	public void barcodeTest()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//driver.get("https://barcode.tec-it.com/en/Code128");
	}

}
