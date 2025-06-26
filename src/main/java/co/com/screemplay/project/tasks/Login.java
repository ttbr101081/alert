package co.com.screemplay.project.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screemplay.project.ui.LoginUI.*;
import static co.com.screemplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MODAL_LOGIN, isVisible())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(MODAL_LOGIN),
                Enter.theValue(USER_NAME).into(INPUT_USER_NAME),
                Enter.theValue(PWD).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
    public static Login authentication(String user, String pwd) {
        return Tasks.instrumented(Login.class, user, pwd);
    }
}
