package co.com.choucair.pruebas.reto_automatizacion.questions;

import co.com.choucair.pruebas.reto_automatizacion.userinterface.AddProduct;
import co.com.choucair.pruebas.reto_automatizacion.userinterface.Buy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerBuy implements Question<Boolean> {
    private String questionBuy;

    public AnswerBuy(String questionBuy) {
        this.questionBuy = questionBuy;
    }

    public static AnswerBuy toThe(String questionBuy) {
        return new AnswerBuy(questionBuy);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String addProduct = Text.of(Buy.SUCCESSFUL_ORDER).viewedBy(actor).asString();
        if (questionBuy.equals(addProduct)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
