package stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AddProductTask;
import tasks.ViewShoppingCartTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductStepDefinition {
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

    @When("^he wants to add products to the shopping cart$")
    public void heWantsToAddProductsToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProductTask.addProductTask());
    }

    @Then("^he wants to see the shopping cart$")
    public void heWantsToSeeTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(ViewShoppingCartTask.viewShoppingCartTask());
    }


}
