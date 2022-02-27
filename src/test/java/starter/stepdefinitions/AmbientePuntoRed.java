package starter.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import io.cucumber.java.es.Y;
import starter.navigation.NavigateTo;


public class AmbientePuntoRed {
    @Y("se ingresa al portal de puntoRed")
    public void se_ingresa_al_portal_de_puntoRed(){
        System.out.println("ingreso al portal de ayuda");
        theActorInTheSpotlight().attemptsTo(
                NavigateTo.thePuntoRedGoHomePage()
        );
    }

}
