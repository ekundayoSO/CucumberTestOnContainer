package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;




public class Test6_AddUserAddressPage extends TestBase {

    @FindBy(how = How.CLASS_NAME, using = "account")
    public static WebElement UserAccountEmailLink;

    @FindBy(how = How.CLASS_NAME, using = "inactive")
    public static WebElement AddressesElement;

    @FindBy(how = How.XPATH, using = "//input[@value='Add new']")
    public static WebElement AddNewAddressesButton;

    @FindBy(how = How.ID_OR_NAME, using = "Address_FirstName")
    public static WebElement UserFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "Address_LastName")
    public static WebElement UserLastName;

    @FindBy(how = How.ID_OR_NAME, using = "Address_Email")
    public static WebElement UserNewEmail;

    @FindBy(how = How.ID_OR_NAME, using = "Address_CountryId")
    public static WebElement CountryDropDown;

    @FindBy(how = How.ID_OR_NAME, using = "Address_City")
    public static WebElement CityField;

    @FindBy(how = How.ID_OR_NAME, using = "Address_Address1")
    public static WebElement AddressField;

    @FindBy(how = How.ID_OR_NAME, using = "Address_ZipPostalCode")
    public static WebElement ZipCodeField;

    @FindBy(how = How.ID_OR_NAME, using = "Address_PhoneNumber")
    public static WebElement PhoneNumberField;

    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    public static WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My account - Addresses')]")
    public static WebElement Assertion;

    public void userClicksOnEmailTextLink() {

        UserAccountEmailLink.click();
    }

    public void userClicksOnTheAddressElement() {

        AddressesElement.click();
        AddNewAddressesButton.click();
    }

    public void userAdjustTheNecessaryField() {
        UserFirstName.sendKeys("John");
        UserLastName.sendKeys("Doe");
        UserNewEmail.sendKeys("bugsVStester@gmail.com");
        new Select(CountryDropDown).selectByVisibleText("Nigeria");
        CityField.sendKeys("Lagos");
        AddressField.sendKeys("2023, Test Avenue");
        ZipCodeField.sendKeys("23401");
        PhoneNumberField.sendKeys("22072023000");
        SaveButton.click();
    }

    public void userClicksOnSaveButtonAndValidateSuccessfulUpdate() {
        String expectedName = "My account - Addresses";
        String actualName = Assertion.getText();
        Assert.assertEquals(actualName, expectedName);

        System.out.println(actualName);
    }

}
