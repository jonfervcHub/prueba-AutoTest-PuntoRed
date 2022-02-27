package starter.ui.homePage;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageForm {

    public static final Target logoPuntoRed = Target.the("Logo de PuntoRed").locatedBy("//a[@class='idt-logo-url']//img[@alt='Logo Puntored']");
    public static final Target ayudaReditectButton = Target.the("Boton con redireccion al modulo de Ayuda").locatedBy("//li[@id='menu-item-318']//child::a[text()='Ayuda']");

}
