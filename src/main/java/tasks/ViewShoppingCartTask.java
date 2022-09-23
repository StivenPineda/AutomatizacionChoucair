package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewShoppingCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.VIEW_SHOPPING_CART)
        );
    }
    public static ViewShoppingCartTask viewShoppingCartTask(){
        return instrumented(ViewShoppingCartTask.class);
    }
}
