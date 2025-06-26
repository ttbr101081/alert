package co.com.screemplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.screemplay.project.ui.AddCarUI.*;
import static co.com.screemplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlaceOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ID_CAR, isVisible())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_CAR),WaitUntil.the(ID_PLACEORDER, isVisible())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_PLACEORDER),
                Enter.theValue(NAME).into(INPUT_NAME),
                Enter.theValue(COUNTRY).into(INPUT_COUNTRY),
                Enter.theValue(CITY).into(INPUT_CITY),
                Enter.theValue(CARD).into(INPUT_CARD),
                Enter.theValue(MONTH).into(INPUT_MONTH),
                Enter.theValue(YEAR).into(INPUT_YEAR),
                Click.on(BTN_CONFIRM)
        );
    }
    public static PlaceOrder choose() {
        return Tasks.instrumented(PlaceOrder.class);
    }
}
