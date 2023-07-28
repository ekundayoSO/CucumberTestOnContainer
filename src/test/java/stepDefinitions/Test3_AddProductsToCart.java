package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.Test3_AddProductsToCartPage;



public class Test3_AddProductsToCart extends TestBase {

    @When("User searches for products and add them to cart")
    public void user_searches_for_products_and_add_them_to_cart() throws InterruptedException {
        Test3_AddProductsToCartPage page = PageFactory.initElements(driver, Test3_AddProductsToCartPage.class);
        Thread.sleep(3000);
        page.userSearchesForProductsAndAddThemToCart();
    }

    @Then("User validates products are successfully added")
    public void user_validates_products_are_successfully_added() {
        Test3_AddProductsToCartPage page = PageFactory.initElements(driver, Test3_AddProductsToCartPage.class);
        page.userValidatesProductsAreSuccessfullyAdded();

    }

}
