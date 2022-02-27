package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^se asigna el (.*)")
    public void se_asigna_el(String name){
        theActorCalled(name);
    }
}
