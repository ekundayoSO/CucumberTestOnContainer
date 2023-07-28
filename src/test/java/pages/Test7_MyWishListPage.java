package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.RETURN;

public class Test7_MyWishListPage {

    @FindBy(how = How.XPATH, using = "//input[@value='Search store']")
    public static WebElement SearchField;

    @FindBy(how = How.CSS, using = "h2 a")
    public static WebElement ProductTitleLinkText;

    @FindBy(how = How.XPATH, using = "//*[@type='button' and @value='Add to wishlist']")
    public static WebElement AddToWishListButton;

    @FindBy(how = How.LINK_TEXT, using = "Wishlist")
    public static WebElement WishListButton;

    @FindBy(how = How.CSS, using = "td a")
    public static List<WebElement> ProductsInWishList;

    public void userSearchesProductsAndAddThemToWishList() {

        SearchField.sendKeys("TCP Public Complete", RETURN);
        ProductTitleLinkText.click();
        AddToWishListButton.click();

        SearchField.sendKeys("Smartphone", RETURN);
        ProductTitleLinkText.click();
        AddToWishListButton.click();

        SearchField.sendKeys("Black & White Diamond Heart", RETURN);
        ProductTitleLinkText.click();
        AddToWishListButton.click();

        SearchField.sendKeys("Health book", RETURN);
        ProductTitleLinkText.click();
        AddToWishListButton.click();
    }

    public void userValidatesProductsInTheWishList() {
        WishListButton.click();

        List<WebElement> itemsInCartElements = ProductsInWishList;
        List<String> itemsInCart = new ArrayList<>();

        itemsInCartElements.forEach(item -> {
            String itemText = item.getText();
            itemsInCart.add(itemText);
        });

        if (!itemsInCart.isEmpty()) {
            System.out.println("Products in the WishList:");
            for (String item : itemsInCart) {
                System.out.println(item);
            }
        } else {
            System.out.println("WishList Is Empty");
        }

    }

}
