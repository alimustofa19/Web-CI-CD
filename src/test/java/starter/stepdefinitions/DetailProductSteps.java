package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.detailProduct.DetailProductPage;

public class DetailProductSteps {
    @Steps
    DetailProductPage detailProductPage;

    @And("I click detail button")
    public void iClickDetailButton(){
        detailProductPage.clickDetailButton();
    }

    @Then("I can see detail product")
    public void iSeeDetailProduct(){
        detailProductPage.seeDetailProduct();
    }
    @Then("I can give rating product")
    public void giveRatingProduct(){
        detailProductPage.productRating();
    }
}
