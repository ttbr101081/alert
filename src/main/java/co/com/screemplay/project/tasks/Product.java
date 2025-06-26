package co.com.screemplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screemplay.project.ui.ProductUI.*;
import static co.com.screemplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Product implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ID_PRODUCT));
        actor.attemptsTo(WaitUntil.the(ID_PRODUCT, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_PRODUCT));
        actor.attemptsTo(Scroll.to(ID_CAR));
        actor.attemptsTo(WaitUntil.the(ID_CAR, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_CAR));
        actor.attemptsTo(Scroll.to(MODAL_HOME));
        actor.attemptsTo(WaitUntil.the(MODAL_HOME, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(MODAL_HOME));
        actor.attemptsTo(Scroll.to(ID_CATEGORY));
        actor.attemptsTo(WaitUntil.the(ID_CATEGORY, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_CATEGORY));
        actor.attemptsTo(Scroll.to(ID_PRODUCT));
        actor.attemptsTo(WaitUntil.the(ID_PRODUCT, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_PRODUCT));
        actor.attemptsTo(Scroll.to(ID_CAR));
        actor.attemptsTo(WaitUntil.the(ID_CAR, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_CAR));
    }
    public static Product choose() {
        return Tasks.instrumented(Product.class);
    }
}
