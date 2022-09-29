package co.com.choucair.pruebas.reto_automatizacion.questions;

import co.com.choucair.pruebas.reto_automatizacion.userinterface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerLogin implements Question<Boolean> {
    private String question;

    public AnswerLogin(String question) {
        this.question = question;
    }

    public static AnswerLogin toThe(String question) {
        return new AnswerLogin(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameLogin = Text.of(Login.TITLE_TEST).viewedBy(actor).asString();
        if (question.equals(nameLogin)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
