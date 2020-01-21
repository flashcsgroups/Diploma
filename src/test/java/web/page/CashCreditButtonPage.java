package web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CashCreditButtonPage {
    private SelenideElement buyCashButton = $(byText("Купить")).parent().parent();
    private SelenideElement buyCreditButton = $(byText("Купить в кредит")).parent().parent();


    public CardPage clickButtonBuyCash() {
        buyCashButton.click();
        return new CardPage();
    }

    public CardPage clickButtonBuyCredit() {
        buyCreditButton.click();
        return new CardPage();
    }
}
