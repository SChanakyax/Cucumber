package StepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Steps extends BaseUtil {

    private BaseUtil baseUtil;

    public Steps(BaseUtil util){
        this.baseUtil = util;
    }

    private WebDriver driver;

    @Before()
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Software\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String usernamex, String passwordx) {
        baseUtil.userFullName = userFullName;
        driver.findElement(By.name("username")).sendKeys(usernamex);
        driver.findElement(By.name("password")).sendKeys(passwordx);
        driver.findElement(By.name("username")).submit();
    }

    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.className("smallText")));

      //  String actualuserFullName = driver.findElement(By.className("smallText")).getText().toString();

//        System.out.println(baseUtil.userFullName.toString());

        //assertTrue(actualuserFullName, actualuserFullName.contains(baseUtil.userFullName));

        driver.findElement(By.linkText("Log Out")).click();


        System.out.println("User will be taken to overview Page");
        //driver.findElement(By.xpath("//div//h1")).isDisplayed();
    }


    @Given("I am in the login page of the para bank application")
    public void iAmInTheLoginPageOfTheParaBankApplication() {

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
}
