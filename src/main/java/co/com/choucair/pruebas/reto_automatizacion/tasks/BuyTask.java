package co.com.choucair.pruebas.reto_automatizacion.tasks;

import co.com.choucair.pruebas.reto_automatizacion.userinterface.Buy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Buy.BUTTON_CHEKOUT),
                Enter.theValue("Jorge").into(Buy.INPUT_FIRST_NAME),
                Enter.theValue("Pineda").into(Buy.INPUT_LAST_NAME),
                Enter.theValue("312412").into(Buy.INPUT_ADDRESS),
                Click.on(Buy.BUTTON_CONTINUE),
                Click.on(Buy.BUTTON_FINISH)
        );
    }

    public static BuyTask buyTask(){ return instrumented(BuyTask.class);}
}
