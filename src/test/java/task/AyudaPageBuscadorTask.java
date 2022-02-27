package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.ayudaPage.AyudaPageForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AyudaPageBuscadorTask implements Task {
    private final String consulta;

    public AyudaPageBuscadorTask(String consulta) {
        this.consulta = consulta;
    }

    public static Performable whitAyudaPageBuscadorTask(String consulta){
        return instrumented(AyudaPageBuscadorTask.class, consulta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AyudaPageForm.buscadorAyudaPage,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(consulta).into(AyudaPageForm.buscadorAyudaPage),
                Click.on(AyudaPageForm.botonBuscadorAyudaPage)
        );

    }
}
