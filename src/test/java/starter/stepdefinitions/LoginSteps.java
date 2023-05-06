package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.HomePage;
import starter.login.LoginPage;
public class LoginSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        loginPage.validateOnTheLoginPage();
    }
    @When("I enter email {string}")
    public void enterEmail(String email){
        loginPage.inputEmail(email);
    }
    @And("I enter password")
    public void enterPassword(){
        loginPage.enterPassword("12345678Aa*");
    }
    @And("I click login button")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnTheHomePage();
    }
    @When("I enter invalid email {string}")
    public void enterInvalidEmail(String email){
        loginPage.invalidEmail(email);
    }
    @And("I enter invalid password")
    public void enterInvalidPassword(){
        loginPage.enterInvalidPassword("12345678Zz*");
    }
    @Then("I see error message {string}")
    public void iAmSeeErrorMessage(String message){
        loginPage.validateMessageError();
        loginPage.iValidateEqualMessageError(message);
    }
    @Then("My password is invisible")
    public void passwordIsInvisible(){
    }
}
