package CucumberRunnerPage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features" , glue = "StepDefinations", tags= "@RadioButton" )
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
