package co.com.choucair.certification.proyectogmail1.stepdefinitions;

import co.com.choucair.certification.proyectogmail1.model.GmailData;
import co.com.choucair.certification.proyectogmail1.questions.Answer;
import co.com.choucair.certification.proyectogmail1.tasks.Login;
import co.com.choucair.certification.proyectogmail1.tasks.OpenUp;
import co.com.choucair.certification.proyectogmail1.tasks.SearchMail;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class GmailStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Leidy wants to find email called  in the inbox$")
    public void thanLeidyWantsToFindEmailCalledInTheInbox(List<GmailData> gmailData) throws Exception {
        OnStage.theActorCalled("Leidy").wasAbleTo(OpenUp.thePage(),
                Login.onThePage
                        (gmailData.get(0).getStrUser(),
                                gmailData.get(0).getStrPassword()));
    }

    @When("^He search for the email  in the inbox$")
    public void heSearchForTheEmailInTheInbox(List<GmailData> gmailData) throws Exception {
        OnStage.theActorCalled("Leidy").attemptsTo(SearchMail.the(gmailData.get(0)));
    }

    //realizamos la verificaciòn de toda la historia de usuario
    @Then("^he finds the email called$")
    public void heFindsTheEmailCalled(List<GmailData> gmailData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(gmailData.get(0))));
    }
}
