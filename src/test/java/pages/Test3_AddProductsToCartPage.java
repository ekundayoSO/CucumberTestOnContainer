package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.RETURN;

public class Test3_AddProductsToCartPage {

    @FindBy(how = How.XPATH, using = "//input[@value='Search store']")
    public static WebElement SearchField;

    @FindBy(how = How.XPATH, using = "//input[@value='Add to cart']")
    public static WebElement AddToCartButton;

    @FindBy(how = How.LINK_TEXT, using = "Shopping cart")
    public static WebElement ShoppingCartButton;

    @FindBy(how = How.CLASS_NAME, using = "product-name")
    public static List<WebElement> ProductsInCart;

    public void userSearchesForProductsAndAddThemToCart() {
        SearchField.sendKeys("Health book", RETURN);
        AddToCartButton.click();
        SearchField.sendKeys("Blue Jeans", RETURN);
        AddToCartButton.click();
        SearchField.sendKeys("Smartphone", RETURN);
        AddToCartButton.click();

    }

    public void userValidatesProductsAreSuccessfullyAdded() {
        ShoppingCartButton.click();

        List<WebElement> itemsInCartElements = ProductsInCart;
        List<String> itemsInCart = new ArrayList<>();

        itemsInCartElements.forEach(item -> {
            String itemText = item.getText();
            itemsInCart.add(itemText);
        });

        if (!itemsInCart.isEmpty()) {
            System.out.println("Products in the Shopping Cart:");
            for (String item : itemsInCart) {
                System.out.println(item);
            }
        } else {
            System.out.println("Shopping Cart Is Empty");
        }

    }


}
