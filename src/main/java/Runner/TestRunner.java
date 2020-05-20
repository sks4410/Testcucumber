package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "C:/75/TestCucumber/src/main/java/Feature/FBlogin.feature", //the path of the feature files
        glue={"StepDefinitions"}) //the path of the step definition files
		

public class TestRunner {
	
	
	

}
