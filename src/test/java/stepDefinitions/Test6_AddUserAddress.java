package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pages.Test6_AddUserAddressPage;

public class Test6_AddUserAddress extends TestBase {

    @When("User clicks on email text link")
    public void user_clicks_on_email_text_link() {
        Test6_AddUserAddressPage page = PageFactory.initElements(driver, Test6_AddUserAddressPage.class);
        page.userClicksOnEmailTextLink();
    }

    @When("User clicks on the addresses element")
    public void user_clicks_on_the_addresses_element() {
        Test6_AddUserAddressPage page = PageFactory.initElements(driver, Test6_AddUserAddressPage.class);
        page.userClicksOnTheAddressElement();
    }

    @When("User adjust the necessary fields")
    public void user_adjust_the_necessary_fields() {
        Test6_AddUserAddressPage page = PageFactory.initElements(driver, Test6_AddUserAddressPage.class);
        page.userAdjustTheNecessaryField();
    }

    @Then("User clicks on save button and validate successful update")
    public void user_clicks_on_save_button_and_validate_successful_update() throws InterruptedException {
        Test6_AddUserAddressPage page = PageFactory.initElements(driver, Test6_AddUserAddressPage.class);
        page.userClicksOnSaveButtonAndValidateSuccessfulUpdate();
    }

}
