package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.Test1_RegistrationPage;


public class Test1_Registration extends TestBase {

    @Given("User clicks on register element")
    public void user_clicks_on_register_element() {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userClicksOnRegisterElement();
    }

    @Given("User select gender")
    public void user_select_gender() {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userSelectGender();
    }

    @Given("User inputs the following details")
    public void user_inputs_the_following_details(io.cucumber.datatable.DataTable dataTable) {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userInputsTheFollowingDetails(dataTable);
    }

    @Given("User enters email address")
    public void user_enters_email_address() {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userEntersEmailAddress();
    }

    @And("User inputs password and confirm password")
    public void userInputsPasswordAndConfirmPassword() {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userInputsPasswordAndConfirmPassword();
    }


    @Then("User clicks register button and verify successful registration")
    public void user_clicks_register_button_and_verify_successful_registration() {
        Test1_RegistrationPage page = PageFactory.initElements(driver, Test1_RegistrationPage.class);
        page.userClicksRegisterButtonAndVerifySuccessfulRegistration();
    }

}
