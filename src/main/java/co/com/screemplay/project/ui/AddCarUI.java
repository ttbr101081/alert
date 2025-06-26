package co.com.screemplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCarUI {
    public static final Target ID_CAR = Target.the("selecciona EL CARRITO")
            .located(By.xpath("/html/body/nav/div/div/ul/li[4]/a"));
    public static final Target ID_PLACEORDER = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("/html/body/div[6]/div/div[2]/button"));
    public static final Target INPUT_NAME = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"name\"]"));
    public static final Target INPUT_COUNTRY = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"country\"]"));
    public static final Target INPUT_CITY = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_CARD = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"card\"]"));
    public static final Target INPUT_MONTH = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"month\"]"));
    public static final Target INPUT_YEAR = Target.the("selecciona PLACE ORDER")
            .located(By.xpath("//*[@id=\"year\"]"));
    public static final Target BTN_CONFIRM = Target.the("FIN PLACE ORDER")
            .located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    public static final Target TEXT_PURCHASE = Target.the("Thank you for your purchase! ")
            .located(By.xpath("/html/body/div[10]/h2"));
}
