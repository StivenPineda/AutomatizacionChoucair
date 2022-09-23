package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target INPUT_USER = Target.the("nombre de usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Contraseña de usuario")
            .located(By.id("password"));
    public static final Target BUTTON_LOGIN =  Target.the("Login")
            .located(By.id("login-button"));

}
