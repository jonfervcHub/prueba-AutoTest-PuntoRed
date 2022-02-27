package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.homePage.HomePageForm;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomePagePuntoRed implements Task {

    public static Performable whitHomePagePuntoRed(){
        return instrumented(HomePagePuntoRed.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePageForm.ayudaReditectButton,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePageForm.ayudaReditectButton)
        );

    }
}
