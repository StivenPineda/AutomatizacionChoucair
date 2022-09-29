package co.com.choucair.pruebas.reto_automatizacion.questions;

import co.com.choucair.pruebas.reto_automatizacion.userinterface.AddProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerAddProduct implements Question<Boolean> {
    private String questionAdd;

    public AnswerAddProduct(String questionAdd) {
        this.questionAdd = questionAdd;
    }
    public static AnswerAddProduct toThe(String questionAdd) {
        return new AnswerAddProduct(questionAdd);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String addProduct = Text.of(AddProduct.TITLE_ADD_PRODUCT).viewedBy(actor).asString();
        if (questionAdd.equals(addProduct)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
