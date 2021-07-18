package co.com.choucair.certification.proyectogmail1.tasks;

import co.com.choucair.certification.proyectogmail1.model.GmailData;
import co.com.choucair.certification.proyectogmail1.userinterface.SearchMailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class SearchMail implements Task {

    private GmailData gmailData;

    public SearchMail(GmailData gmailData) {
        this.gmailData = gmailData;
    }

    public static SearchMail the(GmailData gmailData) {
        return Tasks.instrumented(SearchMail.class, gmailData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(gmailData.getStrNameMail()).into(SearchMailPage.INPUT_SEARCH).thenHit(Keys.ENTER),
                Click.on(SearchMailPage.BUTTON_INBOX),
                Click.on(SearchMailPage.ITEM_MAIL)
        );
    }
}
