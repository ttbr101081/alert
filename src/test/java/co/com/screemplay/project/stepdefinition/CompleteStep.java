package co.com.screemplay.project.stepdefinition;

import co.com.screemplay.project.questions.ValitationText;
import co.com.screemplay.project.tasks.Login;
import co.com.screemplay.project.tasks.PlaceOrder;
import co.com.screemplay.project.tasks.Product;
import co.com.screemplay.project.tasks.Purchase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static co.com.screemplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@AllArgsConstructor
@Slf4j
public class CompleteStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("Login ingresa las credenciales")
    public void login() {

        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(USER_NAME, PWD)
        );
    }
    @Then("Compra producto")
    public void buyProduct() {
        theActorCalled(ACTOR).attemptsTo(
                Product.choose()
        );

    }
    @When("Vayas al carrito de compras llena el formulario")
    public void addCar() {
        theActorCalled(ACTOR).attemptsTo(
                PlaceOrder.choose()
        );
    }
    @Then("Finaliza la compra")
    public void endBuy() {
        theActorCalled(ACTOR).attemptsTo(
                Purchase.choose()
        );
        String validateText = OnStage.theActor(ACTOR).recall(REMEMBER_TEXT);
        if (validateText != null) {
            log.info(validateText);
        }
        theActorInTheSpotlight().should(seeThat(
                ValitationText.witchParams(validateText))
        );
    }
}
