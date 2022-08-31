package StepDefinitions;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Steps {

    private WebDriver driver;

    @Given("I am in the login page of the para bank application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {
        System.out.println("User in the login page");
        System.setProperty("webdriver.chrome.driver","C:\\Software\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials(DataTable table) {

        List<String> loginForm=table.asList();

        driver.findElement(By.name("username")).sendKeys(loginForm.get(0));
        driver.findElement(By.name("password")).sendKeys(loginForm.get(1));
        driver.findElement(By.name("username")).submit();
    }
    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {
        System.out.println("User will be taken to overview Page");
        driver.findElement(By.xpath("//div//h1")).isDisplayed();
    }
}
