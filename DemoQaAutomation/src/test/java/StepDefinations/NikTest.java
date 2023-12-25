package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_Objects.Home_Page;
import utility.TestSetup;
@Test
public class NikTest {
	TestSetup testSetup;
	Home_Page homePage;
	WebDriver driver;
	public NikTest() {
		testSetup =new  TestSetup(driver);
		homePage = testSetup.pageObjectsManager.homePage();
		driver = testSetup.testBase.webDriver();
	}
	
	public void webDriver() throws Throwable {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		testSetup.genericUtils.scrollWindow();
		//testSetup.pageObjectsManager.homePage().open_ElementTile();
		homePage.open_FormsTile();
		testSetup.pageObjectsManager.formPage().submit_the_form();
	}
}
 