package StepDefinations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import page_Objects.PageObjectsManager;
import utility.GenericUtils;
import utility.TestBase;

@Test
public class LoginSteps {
	GenericUtils genericUtils;
	TestBase testBase;
	WebDriver driver ;
	PageObjectsManager pageObjectsManager; 
	public  LoginSteps() {
		testBase = new TestBase();
		driver = testBase.webDriver();
		pageObjectsManager = new PageObjectsManager(driver);
		genericUtils = new GenericUtils(driver);
	}
	@Given("user open the demoQA App")
	public void user_open_the_demo_qa_app() {
		driver.get("https://demoqa.com/");
		//Maximize current window
		driver.manage().window().maximize();
	}
   
   @When("user click on the {string}")
   public void user_click_on_the(String string) {
	   genericUtils.scrollWindow();
	   pageObjectsManager.homePage().open_Tile(string);
       
   }
	
	@Then("validate tile get open")
	public void validate_tile_get_open() {
		System.out.println("Elements are visible");

		// driver.quit();
	}
	//To open Element Items
	@And("user open the {string} page")
	public void user_open_the_element_items(String string) {
		pageObjectsManager.elementPage().open_Element_Items(string);
	}
//Glue code for Element Items page
	//Text Box
	
	@Given("user on the Elements page")
	public void user_on_the_elements_page(){
		driver.get("https://demoqa.com/");
		//Maximize current window
		driver.manage().window().maximize();
		genericUtils.scrollWindow();
		pageObjectsManager.homePage().open_ElementTile();
	}
   @Then("user fill all the text box")
   public void user_fill_all_the_text_box() {
	   pageObjectsManager.elementPage().TextBox();
   }
   @And("user click on submit button")
   public void user_click_on_submit_button() throws InterruptedException {
	   genericUtils.implicitWait();
		 genericUtils.scrollWindow();
	   pageObjectsManager.elementPage().submitTextBox();
	   System.out.println("text Box submitted");
	   Thread.sleep(3000);
	   pageObjectsManager.elementPage().printText("Name");
	   pageObjectsManager.elementPage().printText("Email");
	   pageObjectsManager.elementPage().printText("currentAddress");
	   pageObjectsManager.elementPage().printText("permanentAddress");
	   
   }
   
   //Check Box
   @Then("user tick react check box")
    public void user_open_the_checkBox_page() {
	   pageObjectsManager.elementPage().checkReactBox();
   }
     //Radio Button
   @Then("user tick impressive radio button")
   public void user_tick_impressive_radio_button() {
	   pageObjectsManager.elementPage().impressiveRadioButton();
  }

}
