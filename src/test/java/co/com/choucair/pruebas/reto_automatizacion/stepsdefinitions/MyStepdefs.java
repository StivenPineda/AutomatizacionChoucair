package co.com.choucair.pruebas.reto_automatizacion.stepsdefinitions;

import co.com.choucair.pruebas.reto_automatizacion.tasks.AddProductTask;
import co.com.choucair.pruebas.reto_automatizacion.tasks.BuyTask;
import co.com.choucair.pruebas.reto_automatizacion.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @Then("^Enter the main page$")
    public void enterTheMainPage() {
    }

    @Given("^Stiven visualizes the products$")
    public void stivenVisualizesTheProducts() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/inventory.html"));
    }

    @When("^Select the products you want to add to the shopping cart$")
    public void selectTheProductsYouWantToAddToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProductTask.addProductTask());
    }

    @Then("^View the shopping cart$")
    public void viewTheShoppingCart() {

    }

    @Given("^Steven enters the shopping cart$")
    public void stevenEntersTheShoppingCart() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/cart.html"));
    }

    @When("^Complete the personal data$")
    public void completeThePersonalData() {
        theActorInTheSpotlight().attemptsTo(BuyTask.buyTask());
    }

    @When("^Successful purchase$")
    public void successfulPurchase() {
    }
}
