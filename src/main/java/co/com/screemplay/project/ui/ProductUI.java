package co.com.screemplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductUI {
    public static final Target ID_PRODUCT = Target.the("selecciona EL PRODUCTO")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    public static final Target ID_CAR = Target.the("AGREGAR AL CARRITO")
            .located(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
    public static final Target ID_CATEGORY = Target.the("selecciona EL CATEGORIA")
            .located(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
    public static final Target MODAL_HOME = Target.the("REGRESO AL HOME")
            .located(By.xpath("/html/body/nav/div/div/ul/li[1]/a"));
}
