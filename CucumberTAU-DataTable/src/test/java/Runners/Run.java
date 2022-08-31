package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"StepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {

}
