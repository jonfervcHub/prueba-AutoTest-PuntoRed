package starter.ui.ayudaPage;

import net.serenitybdd.screenplay.targets.Target;

public class AyudaPageForm {

    public static final Target tituloAyudaPAge = Target.the("Titulo del modulo de Ayuda, como podemos ayudarte").locatedBy("//h1[text()='{0}']");
    public static final Target itemMenuAyudaPage = Target.the("Item del menu de Ayuda").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target textoItemMenuAyudaPage = Target.the("Texto desplegado del Item del menu de Ayuda").locatedBy("//div[@id='collapseCard1']/div/div");
    public static final Target buscadorAyudaPage = Target.the("Buscador del modulo de Ayuda").locatedBy("//input[@name='search']");
    public static final Target botonBuscadorAyudaPage = Target.the("Buscador del modulo de Ayuda").locatedBy("//input[@name='search']//following-sibling::div/button[@type='submit']");



}
