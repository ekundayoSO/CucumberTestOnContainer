package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pages.Test7_MyWishListPage;

public class Test7_MyWishList extends TestBase {

    @Given("User searches products and add them to wishlist")
    public void user_searches_products_and_add_them_to_wishlist() throws InterruptedException {
        Test7_MyWishListPage page = PageFactory.initElements(driver, Test7_MyWishListPage.class);
        page.userSearchesProductsAndAddThemToWishList();
    }

    @Then("User validates products in the wishlist")
    public void user_validates_products_in_the_wishlist() {
        Test7_MyWishListPage page = PageFactory.initElements(driver, Test7_MyWishListPage.class);
        page.userValidatesProductsInTheWishList();
    }


}
