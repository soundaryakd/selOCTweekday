package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features/Login.feature",
                           "src/test/java/features/invalidLogin.feature"},
                  glue="steps", monochrome=true)

public class RunTest extends AbstractTestNGCucumberTests {
	
	

}
