package starter.detailProduct;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {
    private By detailButton(){
        return By.xpath("//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By assignRating(){
        return By.xpath("//button[@class= 'v-icon notranslate v-icon--link  far fa-star theme--light accent--text']");
    }

    @Step
    public void clickDetailButton(){
        $(detailButton()).click();
    }

    @Step
    public void seeDetailProduct(){
    };

    @Step
    public void productRating(){
        $(assignRating()).click();
    }
}
