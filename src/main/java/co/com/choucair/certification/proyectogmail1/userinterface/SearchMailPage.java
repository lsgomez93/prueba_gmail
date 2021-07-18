package co.com.choucair.certification.proyectogmail1.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchMailPage {
    public static final Target INPUT_SEARCH = Target.the("were do we write the email that want search")
            .located(By.xpath("//input[@aria-label='Buscar correo']"));
    public static final Target BUTTON_INBOX = Target.the("were do we click inbox")
            .located(By.xpath("//a[contains(text(),'Recibidos')]"));
    public static final Target ITEM_MAIL = Target.the("were do we clic to show mail")
            .located(By.xpath("//a[@aria-label='Destacados']"));
    public static final Target NAME_MAIL = Target.the("get name mail")
            .located(By.xpath("//h2[@id=':qv']//span[contains(text),'Hermana')]"));

}
