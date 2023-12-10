package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.GenericUtils;

public class Element_Page {

	 WebDriver driver;
	 GenericUtils genericUtils;
	public Element_Page(WebDriver driver) {
		this.driver = driver;
		//driver = new ChromeDriver();
		
	}
	
	By TextBox = By.xpath("//span[text()='Text Box']");
	By CheckBox = By.xpath("//span[text()='Check Box']");
	By RadioButton = By.xpath("//span[text()='Radio Button']");
	By WebTables = By.xpath("//span[text()='Web Tables']");
	By Buttons = By.xpath("//span[text()='Buttons']");
	By Links = By.xpath("//span[text()='Links']");
	By BrokenLinksImages = By.xpath("//span[text()='Broken Links - Images']");
	By UploadAndDownload = By.xpath("//span[text()='Upload and DownloadT']");
	By DynamicProperties = By.xpath("//span[text()='Dynamic Properties']");
	
	public void open_Element_Items(String string) {
		if(string.equalsIgnoreCase("TextBox")) {
			driver.findElement(TextBox).click();
		}
		if(string.equalsIgnoreCase("CheckBox")) {
			driver.findElement(CheckBox).click();
		}
		if(string.equalsIgnoreCase("RadioButton")) {
			driver.findElement(RadioButton).click();
		}
		if(string.equalsIgnoreCase("WebTables")) {
			driver.findElement(WebTables).click();
		}
		if(string.equalsIgnoreCase("Buttons")) {
			driver.findElement(Buttons).click();
		}
		if(string.equalsIgnoreCase("Links")) {
			driver.findElement(Links).click();
		}
		if(string.equalsIgnoreCase(" BrokenLinksImages")) {
			driver.findElement(BrokenLinksImages).click();
		}
		if(string.equalsIgnoreCase("UploadAndDownload")) {
			driver.findElement(UploadAndDownload).click();
		}
		if(string.equalsIgnoreCase("DynamicProperties")) {
			driver.findElement(DynamicProperties).click();
		}
		
	}
	//text Box page
	By FulltName = By.xpath("//div[@class='col-md-9 col-sm-12']//child::input[@placeholder='Full Name']");
	By Email = By.xpath("//div[@class='col-md-9 col-sm-12']//child::input[@placeholder='name@example.com']");
	By CurrentAddress = By.xpath("//div[@class='col-md-9 col-sm-12']//child::textarea[@placeholder='Current Address']");
	By Permnentaddress = By.xpath("//div[@class='col-md-9 col-sm-12']//child::textarea[@id='permanentAddress']");
	By SubmitButton = By.id("submit");
	 public void TextBox() {
		 driver.findElement(FulltName).sendKeys("Nikhil");
		 driver.findElement(Email).sendKeys("nikhil@yopmail.com");
		 driver.findElement(CurrentAddress).sendKeys("India");
		 driver.findElement(Permnentaddress).sendKeys("India Delhi");
		
		
	}
	 public void submitTextBox() {
		 
		 driver.findElement(SubmitButton).click();
	 }
	 
	 By NameText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='name']");
	 By emailText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='email']");
	 By currentAddressText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='currentAddress']");
	 By permanentAddressText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='permanentAddress']");
	
	 public void printText(String string) {
		 if(string.equalsIgnoreCase("Name")) {
			 String str = driver.findElement(NameText).getText(); 
			System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("email")) {
			 String str = driver.findElement(emailText).getText(); 
			 System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("currentAddress")) {
			 String str = driver.findElement(currentAddressText).getText(); 
			 System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("permanentAddress")) {
			 String str = driver.findElement(permanentAddressText).getText(); 
			 System.out.println(str);
		 } 
		
	 }
	 
	 //Check Box
	 
	 By Toggle0 = By.xpath("//div[@id='tree-node']/ol/li/span/button");
	 By Toggle1 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button");
	 By Toggle2 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button");
	 By Toggle2A = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/button");
	 By ReactCheckBox = By.xpath("//label[@for='tree-node-react']/span[1]");
	 By Toggle2B = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/button");
	 By Toggle3 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button");
	 
	 public void checkReactBox () {
		 driver.findElement(Toggle0).click();
		 driver.findElement(Toggle2).click();
		 driver.findElement(Toggle2A).click();
		 driver.findElement(ReactCheckBox).click();
	 }
	 
	 //Radio Button
	 By ImpressiveRadioButton = By.xpath("//label[@for='impressiveRadio']");
	 public void impressiveRadioButton() {
		 driver.findElement(ImpressiveRadioButton).click();
	 }
			 
	
}
