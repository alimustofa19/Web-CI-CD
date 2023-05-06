package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Register.LoginPageVal;
import starter.Register.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPageVal loginPageVal;

    @Given("I am on the register page")
    public void onTheRegisterPage(){
        registerPage.openUrl("https://alta-shop.vercel.app/auth/register");
    }

    @When("I input full name")
    public void inputFullName(){
        registerPage.inputFullName("user_empat");
    }

    @And("I input email {string}")
    public void iInputEmail(String mail){
        registerPage.inputMail(mail);
    }

    @And("I input password")
    public void iInputPassword(){
        registerPage.inputPwd("12345Aa*");
    }
    @And("I click register button")
    public void clickRegisterButton(){
        registerPage.clickButtonRegister();
    }
    @Then("I am direct on the login page")
    public void goOnTheLoginPage(){
        loginPageVal.validateOnTheLoginPage();
    }
    @Then("I can see error message {string}")
    public void iCanSeeErrorMassage(String message) {
        registerPage.validateErrorMessage();
        registerPage.iValidateEqualErrorMessage(message);
    }
    @Then("Invisible password")
    public void invisiblePassword(){
    }
}
