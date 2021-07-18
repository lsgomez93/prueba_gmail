package co.com.choucair.certification.proyectogmail1.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USER = Target.the("were do we write user email")
            .located(By.xpath("//input[@id='identifierId']"));
    public static final Target BUTTON_NEXT_USER = Target.the("next button to field password")
            .located(By.xpath("//span[contains(text(), 'Siguiente')]"));
    public static final Target INPUT_PASSWORD = Target.the("were do we write user password")
            .located(By.xpath("//input[@name='password']"));
    public static final Target BUTTON_SEND = Target.the("button to acceded email")
            .located(By.xpath("//span[contains(text(), 'Siguiente')]"));

}
