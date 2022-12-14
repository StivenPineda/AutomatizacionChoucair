package co.com.choucair.pruebas.reto_automatizacion.stepsdefinitions;

import co.com.choucair.pruebas.reto_automatizacion.questions.AnswerAddProduct;
import co.com.choucair.pruebas.reto_automatizacion.questions.AnswerBuy;
import co.com.choucair.pruebas.reto_automatizacion.questions.AnswerLogin;
import co.com.choucair.pruebas.reto_automatizacion.tasks.AddProductTask;
import co.com.choucair.pruebas.reto_automatizacion.tasks.BuyTask;
import co.com.choucair.pruebas.reto_automatizacion.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyStepdefs {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("stiven");
    }

    @Given("^Stiven wants to log in Swag Labs$")
    public void stivenWantsToLogInSwagLabs() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^enter the credentials$")
    public void enterTheCredentials() {
        theActorInTheSpotlight().attemptsTo(LoginTask.loginTask());
    }

    @Then("^Enter the main page and view (.*)$")
    public void enterTheMainPage(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.toThe(question)));
    }

    @Given("^Stiven visualizes the products$")
    public void stivenVisualizesTheProducts() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
        theActorInTheSpotlight().wasAbleTo(LoginTask.loginTask());
    }

    @When("^Select the products you want to add to the shopping cart$")
    public void selectTheProductsYouWantToAddToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProductTask.addProductTask());
    }

    @Then("^View the shopping cart (.*)$")
    public void viewTheShoppingCart(String questionAdd) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerAddProduct.toThe(questionAdd)));

    }

    @Given("^Steven enters the shopping cart$")
    public void stevenEntersTheShoppingCart() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
        theActorInTheSpotlight().wasAbleTo(LoginTask.loginTask());
        theActorInTheSpotlight().wasAbleTo(AddProductTask.addProductTask());
    }

    @When("^Complete the personal data$")
    public void completeThePersonalData() {
        theActorInTheSpotlight().attemptsTo(BuyTask.buyTask());
    }

    @When("^Successful purchase and (.*)$")
    public void successfulPurchase(String questionBuy) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerBuy.toThe(questionBuy)));
    }
}
