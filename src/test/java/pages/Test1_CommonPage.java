package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1_CommonPage {

    @FindBy(how = How.CLASS_NAME, using = "ico-login")
    public static WebElement LoginButton;

    @FindBy(how = How.ID_OR_NAME, using = "Email")
    public static WebElement EmailField;

    @FindBy(how = How.ID_OR_NAME, using = "Password")
    public static WebElement PasswordField;

    @FindBy(how = How.XPATH, using = "//*[@value='Log in']")
    public static WebElement SubmitButton;

    public void userClicksOnLoginButton() {
        LoginButton.click();
    }

    private final Properties CONFIG;

    public Test1_CommonPage() throws IOException {
        CONFIG = new Properties();
        FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
        CONFIG.load(fn);
    }

    public void userEntersEmailAndPassword() {
        EmailField.sendKeys(CONFIG.getProperty("Username"));
        PasswordField.sendKeys(CONFIG.getProperty("Password"));
    }

    public void userClicksLoginButton() {

        SubmitButton.click();
    }

}
