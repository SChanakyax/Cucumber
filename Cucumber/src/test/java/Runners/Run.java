package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"stepdefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {

}
