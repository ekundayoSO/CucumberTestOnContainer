package pages;

import io.cucumber.datatable.DataTable;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Test5_EditUserAccountPage {

    @FindBy(how = How.CLASS_NAME, using = "account")
    public static WebElement UserAccountEmailLink;

    @FindBy(how = How.ID_OR_NAME, using = "FirstName")
    public static WebElement UserFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "LastName")
    public static WebElement UserLastName;

    @FindBy(how = How.ID_OR_NAME, using = "Email")
    public static WebElement UserNewEmail;

    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    public static WebElement SaveButton;

    public void userClicksOnTheEmailTextLink() {

        UserAccountEmailLink.click();
    }

    public void userEditNameFields(DataTable dataTable) {
        List<List<String>> obj = dataTable.asLists();
        UserFirstName.clear();
        UserFirstName.sendKeys(obj.get(0).get(0));
        UserLastName.clear();
        UserLastName.sendKeys(obj.get(0).get(1));

    }

    public void userEntersNewEmail() {
        String randomEmail = RandomStringUtils.randomAlphanumeric(3) + "@gmail.com";
        UserNewEmail.clear();
        UserNewEmail.sendKeys(randomEmail);
    }

    public void userClicksOnSaveButtonAndVerifySuccessfulUpdate() {
        SaveButton.click();

        String newEmail = UserAccountEmailLink.getText();
        System.out.println(newEmail);
    }

  }
