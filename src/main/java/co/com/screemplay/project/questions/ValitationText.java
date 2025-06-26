package co.com.screemplay.project.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.screemplay.project.ui.AddCarUI.TEXT_PURCHASE;
import static co.com.screemplay.project.utils.Constants.REMEMBER_TEXT;
@AllArgsConstructor
@Slf4j
public class ValitationText implements Question<Boolean> {
    private String textPurchase;
    @Override
    @Subject("{0} Finalizo la compra")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textPurchase = TEXT_PURCHASE.resolveFor(actor).getText();

        if (textPurchase != null && REMEMBER_TEXT.equals(textPurchase)) {
            log.info(textPurchase);
            result = true;
        } else {
            result = false;
        }
        return result;

    }
    public static ValitationText witchParams(String textPurchase) {
        return new ValitationText(textPurchase);
    }
}
