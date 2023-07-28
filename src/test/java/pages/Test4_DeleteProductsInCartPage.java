package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Test4_DeleteProductsInCartPage {

    @FindBy(how = How.LINK_TEXT, using = "Shopping cart")
    public static WebElement ShoppingCartButton;

    @FindBy(how = How.XPATH, using = "//td/input[@type='checkbox']")
    public static List<WebElement> CheckBoxes;

    @FindBy(how = How.XPATH, using = "//*[@value='Update shopping cart']")
    public static WebElement UpdateCartButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping cart')]")
    public static WebElement ProductsInCart;

    public void userClicksShoppingCartElement() {

        ShoppingCartButton.click();
    }

    public void userClicksOnRemoveCheckboxes() {
        List<WebElement> boxes = CheckBoxes;
        for (WebElement box : boxes) {
            box.click();
        }
    }

    public void userClicksOnUpdateShoppingCart() {

        UpdateCartButton.click();
    }

    public boolean userVerifyAllProductsAreDeletedFromCart() {
        return ProductsInCart.isDisplayed();

    }
}
