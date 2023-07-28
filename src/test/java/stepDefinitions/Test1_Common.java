package stepDefinitions;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.Test1_CommonPage;

import java.io.IOException;


public class Test1_Common extends TestBase {

    @Before
    public void setUp() throws IOException {
        initialize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @When("User clicks on log in button")
    public void user_clicks_on_log_in_button() {
        Test1_CommonPage page = PageFactory.initElements(driver, Test1_CommonPage.class);
        page.userClicksOnLoginButton();
    }

    @When("User enters email and password")
    public void user_enters_email_and_password() {
        Test1_CommonPage page = PageFactory.initElements(driver, Test1_CommonPage.class);
        page.userEntersEmailAndPassword();
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        Test1_CommonPage page = PageFactory.initElements(driver, Test1_CommonPage.class);
        page.userClicksLoginButton();
    }


}
