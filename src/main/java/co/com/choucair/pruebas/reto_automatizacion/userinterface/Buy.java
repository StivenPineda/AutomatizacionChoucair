package co.com.choucair.pruebas.reto_automatizacion.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Buy {
    public static final Target BUTTON_CHEKOUT = Target.the("Check information")
            .located(By.name("checkout"));
    public static final Target INPUT_FIRST_NAME = Target.the("First name")
            .located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("Last name")
            .located(By.id("last-name"));
    public static final Target INPUT_ADDRESS = Target.the("Address")
            .located(By.id("postal-code"));
    public static final Target BUTTON_FINISH = Target.the("Shop finish")
            .located(By.id("finish"));
    public static final Target BUTTON_CONTINUE = Target.the("continue to shop")
            .located(By.id("continue"));
    public static final Target SUCCESSFUL_ORDER = Target.the("Pedido realizado")
            .located(By.className("complete-header"));
}
