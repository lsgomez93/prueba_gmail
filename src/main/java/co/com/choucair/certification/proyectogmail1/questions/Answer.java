package co.com.choucair.certification.proyectogmail1.questions;

import co.com.choucair.certification.proyectogmail1.model.GmailData;
import co.com.choucair.certification.proyectogmail1.userinterface.SearchMailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private GmailData gmailData;

    public Answer(GmailData gmailData) {
        this.gmailData = gmailData;
    }

    public static Answer toThe(GmailData gmailData) {
        return new Answer(gmailData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameMail = Text.of(SearchMailPage.ITEM_MAIL).viewedBy(actor).asString();
        if (gmailData.getStrNameMail().equals(nameMail)) {
            System.out.println(gmailData.getStrNameMail()+"Helloo word");
            System.out.println("hola pasamos hasta aqui !!!!! True");
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

