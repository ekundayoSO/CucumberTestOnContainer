package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test2_HomePagePage {

    @FindBy(how = How.CLASS_NAME, using = "ico-logout")
    public static WebElement Assertion;

    public void userVerifyLoginIsSuccessful() {
        String expectedLoginSuccess = "Log out";
        String actualLoginSuccess = Assertion.getText();
        Assert.assertEquals(actualLoginSuccess, expectedLoginSuccess);
        System.out.println(actualLoginSuccess);

    }

}
