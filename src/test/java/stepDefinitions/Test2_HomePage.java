package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pages.Test2_HomePagePage;

public class Test2_HomePage extends TestBase {

    @Then("User verify login is successful")
    public void userVerifyLoginIsSuccessful() {
        Test2_HomePagePage page = PageFactory.initElements(driver, Test2_HomePagePage.class);
        page.userVerifyLoginIsSuccessful();

    }

}
