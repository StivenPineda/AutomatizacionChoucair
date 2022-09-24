package co.com.choucair.pruebas.reto_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProduct {
    public static final Target BUTTON_ADD_1 = Target.the("product 1")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BUTTON_ADD_2 = Target.the("product 2")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BUTTON_ADD_3 = Target.the("product 3")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BUTTON_ADD_4 = Target.the("product 4")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target BUTTON_ADD_5 = Target.the("product 5")
            .located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    public static final Target VIEW_SHOPPING_CART = Target.the("View shopping cart")
            .located(By.id("shopping_cart_container"));

}
