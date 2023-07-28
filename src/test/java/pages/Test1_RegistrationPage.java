package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Test1_RegistrationPage {

    @FindBy(how = How.CLASS_NAME, using = "ico-register")
    public static WebElement RegisterButton;

    @FindBy(how = How.ID_OR_NAME, using = "gender-male")
    public static WebElement GenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "FirstName")
    public static WebElement FirstNameField;

    @FindBy(how = How.ID_OR_NAME, using = "LastName")
    public static WebElement LastNameField;

    @FindBy(how = How.ID_OR_NAME, using = "Email")
    public static WebElement EmailField;

    @FindBy(how = How.ID_OR_NAME, using = "Password")
    public static WebElement PasswordField;

    @FindBy(how = How.ID_OR_NAME, using = "ConfirmPassword")
    public static WebElement ConfirmPasswordField;

    @FindBy(how = How.ID_OR_NAME, using = "register-button")
    public static WebElement RegisterBtn;

    @FindBy(how = How.CLASS_NAME, using = "result")
    public static WebElement RegistrationMsg;

    public void userClicksOnRegisterElement() {
        RegisterButton.click();
    }

    public void userSelectGender() {

        GenderButton.click();
    }

    public void userInputsTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> obj = dataTable.asLists();
        FirstNameField.sendKeys(obj.get(0).get(0));
        LastNameField.sendKeys(obj.get(0).get(1));
    }

    public void userEntersEmailAddress() {
        String randomEmail = RandomStringUtils.randomAlphanumeric(3) + "@gmail.com";
        EmailField.sendKeys(randomEmail);
        System.out.println(randomEmail);
    }

    public void userInputsPasswordAndConfirmPassword() {
        int passwordLength = 8;
        String randomPassword = RandomStringUtils.randomAlphanumeric(passwordLength);
        PasswordField.sendKeys(randomPassword);
        ConfirmPasswordField.sendKeys(randomPassword);

        System.out.println(randomPassword);
    }

    public void userClicksRegisterButtonAndVerifySuccessfulRegistration() {
        RegisterBtn.click();

        String registrationSuccessMsg = "Your registration completed";
        String actualSuccessMsg = RegistrationMsg.getText();
        Assert.assertEquals(actualSuccessMsg, registrationSuccessMsg);

        System.out.println(actualSuccessMsg);

    }
}
