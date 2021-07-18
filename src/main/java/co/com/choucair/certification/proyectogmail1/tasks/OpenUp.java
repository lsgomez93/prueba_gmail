package co.com.choucair.certification.proyectogmail1.tasks;

import co.com.choucair.certification.proyectogmail1.userinterface.GmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private GmailPage gmailPage;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(gmailPage));

    }
}
