package co.com.screemplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.screemplay.project.ui.AddCarUI.TEXT_PURCHASE;
import static co.com.screemplay.project.utils.Constants.REMEMBER_TEXT;

public class Purchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String textPurchase = TEXT_PURCHASE.resolveFor(actor).getText();
        actor.remember(REMEMBER_TEXT, textPurchase);
    }
    public static Purchase choose() {
        return Tasks.instrumented(Purchase.class);
    }
}
