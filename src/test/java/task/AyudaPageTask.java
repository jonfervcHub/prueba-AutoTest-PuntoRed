package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.ayudaPage.AyudaPageForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AyudaPageTask implements Task {
    private final String itemMenuAyuda;

    public AyudaPageTask(String itemMenuAyuda) {
        this.itemMenuAyuda = itemMenuAyuda;
    }

    public static Performable whitAyudaPageTask(String itemMenuAyuda){
        return instrumented(AyudaPageTask.class, itemMenuAyuda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Ruptura");
        actor.attemptsTo(
                WaitUntil.the(AyudaPageForm.itemMenuAyudaPage.of(itemMenuAyuda),isClickable()).forNoMoreThan(10).seconds(),
                Click.on(AyudaPageForm.itemMenuAyudaPage.of(itemMenuAyuda))
        );
        //System.out.println("Ruptura");

    }
}
