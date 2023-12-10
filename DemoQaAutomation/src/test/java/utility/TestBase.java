package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

	public WebDriver driver;


	public  WebDriver webDriver() {
		driver = new ChromeDriver();

		return driver;
	}
}
