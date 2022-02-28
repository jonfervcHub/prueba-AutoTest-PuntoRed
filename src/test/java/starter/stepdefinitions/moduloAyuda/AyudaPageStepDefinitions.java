package starter.stepdefinitions.moduloAyuda;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import questions.AyudaPageQuestions;
import starter.ui.ayudaPage.AyudaPageForm;
import starter.ui.homePage.HomePageForm;
import task.AyudaPageBuscadorTask;
import task.AyudaPageTask;
import task.HomePagePuntoRed;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AyudaPageStepDefinitions {

    @Entonces("valida el homepage del ambiente con el logo de PuntoRed")
    public void validaElHomepageDelAmbienteConElLogoDePuntoRed() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(HomePageForm.logoPuntoRed,isVisible()).forNoMoreThan(10).seconds()
        );
    }

    @Y("el usuario ingresa al portal de ayuda")
    public void el_usuario_ingresa_al_portal_de_ayuda(){
        System.out.println("ruptura");
        theActorInTheSpotlight().attemptsTo(
                HomePagePuntoRed.whitHomePagePuntoRed()
        );
    }

    @Y("valida titulo en el portal de Ayuda con el texto {string}")
    public void validatituloenelportaldeAyudaconeltexto (String textoTitulo) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(AyudaPageForm.tituloAyudaPAge.of(textoTitulo),isVisible()).forNoMoreThan(10).seconds()
        );
    }

    @Y("el usuario selecciona el {string} requerido")
    public void elUsuarioSeleccionaElItemMenuAyudaRequerido(String itemMenuAyuda) {
        //System.out.println("ruptura");
        theActorInTheSpotlight().attemptsTo(
                AyudaPageTask.whitAyudaPageTask(itemMenuAyuda)
        );
    }

    @Y("se valida la informacion desplegada versus la {string}")
    public void seValidaLaInformacionDesplegadaVersusLaInformacionEsperadaItem(String informacionEsperadaItem) {
        System.out.println("Ruptura");
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(AyudaPageForm.textoItemMenuAyudaPage,isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(AyudaPageQuestions.textoItem().answeredBy(theActorInTheSpotlight())).contains(informacionEsperadaItem)
        );
    }

    @Y("el usuario ingresa una {string} en el buscador del portal de Ayuda")
    public void elUsuarioIngresaUnaConsultaEnElBuscadorDelPortalDeAyuda(String consulta) {

        theActorInTheSpotlight().attemptsTo(
                AyudaPageBuscadorTask.whitAyudaPageBuscadorTask(consulta)
        );
    }
}
