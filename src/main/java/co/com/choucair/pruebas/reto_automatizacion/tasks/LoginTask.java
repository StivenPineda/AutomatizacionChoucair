package co.com.choucair.pruebas.reto_automatizacion.tasks;

import co.com.choucair.pruebas.reto_automatizacion.userinterface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(Login.INPUT_USER),
                Enter.theValue("secret_sauce").into(Login.INPUT_PASSWORD),
                Click.on(Login.BUTTON_LOGIN)
        );
    }

    public static LoginTask loginTask(){
        return instrumented(LoginTask.class);
    }
}
