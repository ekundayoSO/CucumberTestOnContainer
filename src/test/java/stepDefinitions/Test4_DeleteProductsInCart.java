package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.Test4_DeleteProductsInCartPage;

public class Test4_DeleteProductsInCart extends TestBase {


    @When("User clicks shopping cart element")
    public void user_clicks_shopping_cart_element() {
        Test4_DeleteProductsInCartPage page = PageFactory.initElements(driver, Test4_DeleteProductsInCartPage.class);
        page.userClicksShoppingCartElement();
    }

    @When("User clicks on remove checkboxes")
    public void user_clicks_on_remove_checkboxes() {
        Test4_DeleteProductsInCartPage page = PageFactory.initElements(driver, Test4_DeleteProductsInCartPage.class);
        page.userClicksOnRemoveCheckboxes();
    }

    @When("User clicks on update shopping cart")
    public void user_clicks_on_update_shopping_cart() {
        Test4_DeleteProductsInCartPage page = PageFactory.initElements(driver, Test4_DeleteProductsInCartPage.class);
        page.userClicksOnUpdateShoppingCart();
    }

    @Then("User verify all products are deleted from cart")
    public void user_verify_all_products_are_deleted_from_cart() {
        Test4_DeleteProductsInCartPage page = PageFactory.initElements(driver, Test4_DeleteProductsInCartPage.class);
        boolean isCartEmpty = page.userVerifyAllProductsAreDeletedFromCart();
        if (isCartEmpty) {
            System.out.println("Products have been successfully deleted from the cart.");
        } else {
            System.out.println("Products still exist in the cart. Deletion process failed.");
        }
    }

}
