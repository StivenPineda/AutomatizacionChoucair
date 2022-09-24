package co.com.choucair.pruebas.reto_automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import co.com.choucair.pruebas.reto_automatizacion.userinterface.AddProduct;
import co.com.choucair.pruebas.reto_automatizacion.userinterface.Login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddProduct.BUTTON_ADD_1),
                Click.on(AddProduct.BUTTON_ADD_2),
                Click.on(AddProduct.BUTTON_ADD_3),
                Click.on(AddProduct.BUTTON_ADD_4),
                Click.on(AddProduct.BUTTON_ADD_5),
                Click.on(AddProduct.VIEW_SHOPPING_CART)
        );
    }
    public static AddProductTask addProductTask(){
        return instrumented(AddProductTask.class);
    }
}
