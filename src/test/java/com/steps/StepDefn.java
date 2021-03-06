package com.steps;

import com.pages.TestScriptPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

/**
 * The type Step defn.
 */
public class StepDefn{
    /**
     * The Test script page.
     */
    TestScriptPage testScriptPage = new TestScriptPage();
    public static List<String> wishList;

    /**
     * Add different products to my wish list.
     * @author: Hari
     * @throws InterruptedException the interrupted exception
     */
    @Given("I add different products to my wish list")
    public void i_add_different_products_to_my_wish_list(DataTable datatable) throws InterruptedException {
        wishList=  datatable.asList();
        testScriptPage.addDifferentProductsToWishList(wishList);
    }

    /**
     * View my wish list table.
     * @author: Hari
     */
    @When("I view my wish list table")
    public void i_view_my_wish_list_table() {
        testScriptPage.viewMyWishListTable();
    }

    /**
     * Find total four selected items in my wish list.
     * @author: Hari
     */
    @Then("I find total four selected items in my wish list")
    public void i_find_total_four_selected_items_in_my_wish_list() {
        testScriptPage.totalItemsInWishList(wishList);
    }

    /**
     * Search for lowest price product.
     * @author: Hari
     */
    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        testScriptPage.findLowestFarefromTable();
    }

    /**
     * Am able to add the lowest price item to my cart.
     * @author: Hari
     */
    @When("I am able to add the lowest price item to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
        testScriptPage.addLowestItemToCart();
    }

    /**
     * Am able to verify the item in my cart.
     * @author: Hari
     */
    @Then("I am able to verify the item in my cart")
    public void i_am_able_to_verify_the_item_in_my_cart() {
        testScriptPage.verifyItemIntheCart();
    }

}
