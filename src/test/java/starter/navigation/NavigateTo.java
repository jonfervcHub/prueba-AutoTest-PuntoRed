package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable thePuntoRedGoHomePage(){
        return Task.where("abre pagina Home de Punto Red",
                Open.browserOn().the(PuntoRedGoHomePage.class));
    }
}
