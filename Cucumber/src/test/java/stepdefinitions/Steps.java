package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    private WebDriver driver;

    @Given("I am in the login page of the para bank application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {
        System.out.println("ndfkfdk");

        System.setProperty("webdriver.chrome.driver","C:\\Software\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");

    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        System.out.println("qw");
    }
    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {
        System.out.println("ddd");
    }

}
