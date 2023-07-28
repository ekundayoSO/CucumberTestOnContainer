package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.Test5_EditUserAccountPage;

public class Test5_EditUserAccount extends TestBase {

    @When("User clicks on the email text link")
    public void user_clicks_on_the_email_text_link() {
        Test5_EditUserAccountPage page = PageFactory.initElements(driver, Test5_EditUserAccountPage.class);
        page.userClicksOnTheEmailTextLink();
    }

    @And("User edits name fields")
    public void userEditsNameFields(io.cucumber.datatable.DataTable dataTable) {
        Test5_EditUserAccountPage page = PageFactory.initElements(driver, Test5_EditUserAccountPage.class);
        page.userEditNameFields(dataTable);
    }

    @And("User enters new email")
    public void userEntersNewEmail() {
        Test5_EditUserAccountPage page = PageFactory.initElements(driver, Test5_EditUserAccountPage.class);
        page.userEntersNewEmail();
    }


    @Then("User clicks on save button and verify successful update")
    public void user_clicks_on_save_button_and_verify_successful_update() {
        Test5_EditUserAccountPage page = PageFactory.initElements(driver, Test5_EditUserAccountPage.class);
        page.userClicksOnSaveButtonAndVerifySuccessfulUpdate();
    }



}
