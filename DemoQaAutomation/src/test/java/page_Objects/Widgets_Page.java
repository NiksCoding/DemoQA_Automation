package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.GenericUtils;

public class Widgets_Page {

	WebDriver driver;
	GenericUtils genericUtils;
	Actions actions;
	public Widgets_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);	

	}
	//Widgets
		By AutoComplete = By.xpath("//span[text()='Auto Complete']");
		By Accordian = By.xpath("//span[text()='Accordian']");
		By DatePicker = By.xpath("//span[text()='Date Picker']");
		By Slider = By.xpath("//span[text()='Slider']");
		By ProgressBar = By.xpath("//span[text()='Progress Bar']");
		By ToolTips = By.xpath("//span[text()='Tool Tips']");
		By Menu = By.xpath("//span[text()='Menu']");
		By SelectMenu = By.xpath("//span[text()='Select Menu']");

		public void open_widgets_items(String string) {
			genericUtils.scrollWindow();
			//genericUtils.explicitWait().until(ExpectedConditions.visibilityOfAllElements())
			if(string.equalsIgnoreCase("Accordian")) {
				driver.findElement(Accordian).click();
			}
			if(string.equalsIgnoreCase("AutoComplete")) {
				driver.findElement(AutoComplete).click();
			}
			if(string.equalsIgnoreCase("DatePicker")) {
				driver.findElement(DatePicker).click();
			}
			if(string.equalsIgnoreCase("Slider")) {
				driver.findElement(Slider).click();
			}
			if(string.equalsIgnoreCase("ProgressBar")) {
				driver.findElement(ProgressBar).click();
			}
			if(string.equalsIgnoreCase("ToolTips")) {
				genericUtils.scrollWindow();
				driver.findElement(ToolTips).click();
			}
			if(string.equalsIgnoreCase("Menu")) {
				genericUtils.scrollWindow();
				driver.findElement(Menu).click();
			}
			if(string.equalsIgnoreCase("SelectMenu")) {
				genericUtils.scrollWindow();
				driver.findElement(SelectMenu).click();
			}
		}
}
