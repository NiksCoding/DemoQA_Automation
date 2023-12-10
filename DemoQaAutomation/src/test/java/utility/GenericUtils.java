package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	
	public TestBase testBase;
	public WebDriver driver;
	public WebDriverWait wait;
	public GenericUtils(WebDriver driver) {
		//testBase = new TestBase();
		//driver = testBase.driver;
		this.driver = driver;
	}
	
	public void scrollWindow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", ""); 
	}
	public void explicitWait() {
		//WebDriverWait wait=new WebDriverWait(driver, 20);
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
