package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.product.ProductPage;

public class ProductSteps {
    @Steps
    ProductPage productPage;


    @Then("I can see all product")
    public void iSeeAllProduct(){
        productPage.seeAllProduct();
    }

    @And("I click icon triangle")
    public void clickIconTriangle(){
        productPage.seeCategoryProduct();
    }

    @Then("I can see category product")
    public void iSeeCategoryProduct(){
        productPage.seeProductCategory();
    }

    @And("I click buy button")
    public void iClickBuyButton(){
        productPage.clickBuyButton();
    }

    @Then("I can add item to cart")
    public void canAddItemToCart(){
        productPage.addItemToCart();
    }

    @Then("I can see product by category")
    public void canSeeProductByCategory(){
        productPage.productByCategory();
    }
}
