package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.transactions.TransactionsPage;

public class TransactionsSteps {
    @Steps
    TransactionsPage transactionsPage;

    @And("I click icon cart")
    public void iClickIconCart(){
        transactionsPage.clickIconCart();
    }

    @And("I click payment button")
    public void iClickPaymentButton(){
        transactionsPage.clickPaymentButton();
    }

    @Then("I can see detail transactions")
    public void iSeeDetailTransactions(){
        transactionsPage.detailTransactions();
    }
}
