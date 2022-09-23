package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import userinterface.Home;
import userinterface.Login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(Login.INPUT_USER),
                Enter.theValue("secret_sauce").into(Login.INPUT_PASSWORD),
                Click.on(Login.BUTTON_LOGIN),
                Click.on(Home.BUTTON_ADD_1),
                Click.on(Home.BUTTON_ADD_2),
                Click.on(Home.BUTTON_ADD_3),
                Click.on(Home.BUTTON_ADD_4),
                Click.on(Home.BUTTON_ADD_5)
        );
    }
    public static AddProductTask addProductTask(){
        return instrumented(AddProductTask.class);
    }
}
