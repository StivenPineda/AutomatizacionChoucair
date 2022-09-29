package co.com.choucair.pruebas.reto_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target INPUT_USER = Target.the("nombre de usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Contraseña de usuario")
            .located(By.id("password"));
    public static final Target BUTTON_LOGIN =  Target.the("Login")
            .located(By.id("login-button"));
    public static final Target TITLE_TEST = Target.the("Extrae un elemento despues del login")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

}
