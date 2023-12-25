package page_Objects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	Home_Page homePage;
	Element_Page elementPage;
	Form_Page  formPage;
	AlertsFrameAndWindows_Page alertsFrameAndWindows_Page;
	Widgets_Page widgetsPage;
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
	public Form_Page formPage() {
		formPage = new Form_Page(driver);

		return formPage;
	}
	public AlertsFrameAndWindows_Page alertsFrameAndWindows_Page() {
		alertsFrameAndWindows_Page = new AlertsFrameAndWindows_Page(driver);

		return alertsFrameAndWindows_Page;
	}
	public Widgets_Page widgetsPage() {
		widgetsPage = new Widgets_Page(driver);
		return widgetsPage;
	}

}
