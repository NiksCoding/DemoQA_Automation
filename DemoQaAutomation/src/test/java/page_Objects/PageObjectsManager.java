package page_Objects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	Home_Page homePage;
	Element_Page elementPage;
	WebDriver driver;

	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	public Home_Page homePage() {
		homePage = new Home_Page(driver);
		return homePage;
	}
	public Element_Page elementPage() {
		elementPage = new Element_Page(driver);

		return elementPage;
	}

}
