package starter.transactions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionsPage extends PageObject {

    private By iconCart(){
        return By.xpath("//button[@class= 'v-btn v-btn--icon v-btn--round theme--dark v-size--default']");
    }
    private By paymentButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary']");
    }

    @Step
    public void clickIconCart(){
        $(iconCart()).click();
    }

    @Step
    public void clickPaymentButton(){
        $(paymentButton()).click();
    }

    @Step
    public void detailTransactions(){
    };
}
