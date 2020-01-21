package web.page;

import com.codeborne.selenide.SelenideElement;
import web.data.DataHelper;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CardPage {
    private SelenideElement buyCashButton = $(byText("Купить")).parent().parent();
    private SelenideElement buyCreditButton = $("button__text").find
        (byText("Купить в кредит")).parent().parent();
    private SelenideElement numberCardField = $("[placeholder='0000 0000 0000 0000']");
    private SelenideElement monthCardField = $("[placeholder='08']");
    private SelenideElement yearCardField = $("[placeholder='22']");
    private SelenideElement ownerNameCardField = $(byXpath("//*[@id=\"root\"]/div/form/fieldset/div[3]" +
            "/span/span[1]/span/span/span[2]/input"));
    private SelenideElement codeCardField = $("[placeholder='999']");
    private SelenideElement continueButton = $(byText("Продолжить")).parent().parent();


    public CardPage validCashCard(DataHelper.AuthInfo info) {
        buyCashButton.click();
        numberCardField.setValue(info.getCardNumber());
        monthCardField.setValue(info.getMonth());
        yearCardField.setValue(info.getYear());
        codeCardField.setValue(info.getCodeCard());
        ownerNameCardField.setValue(info.getOwnerNameCard());
        continueButton.click();
        return new CardPage();
    }

    public CardPage validCreditCard(DataHelper.AuthInfo info) {
        buyCreditButton.click();
        numberCardField.setValue(info.getCardNumber());
        monthCardField.setValue(info.getMonth());
        yearCardField.setValue(info.getYear());
        codeCardField.setValue(info.getCodeCard());
        ownerNameCardField.setValue(info.getOwnerNameCard());
        continueButton.click();
        return new CardPage();
    }

    public CardPage notValidCashCard(DataHelper.AuthInfo info) {
        buyCashButton.click();
        numberCardField.setValue(info.getCardNumber());
        monthCardField.setValue(info.getMonth());
        yearCardField.setValue(info.getYear());
        codeCardField.setValue(info.getCodeCard());
        ownerNameCardField.setValue(info.getOwnerNameCard());
        continueButton.click();
        return new CardPage();
    }

    public CardPage notValidCreditCard(DataHelper.AuthInfo info) {
        buyCreditButton.click();
        numberCardField.setValue(info.getCardNumber());
        monthCardField.setValue(info.getMonth());
        yearCardField.setValue(info.getYear());
        codeCardField.setValue(info.getCodeCard());
        ownerNameCardField.setValue(info.getOwnerNameCard());
        continueButton.click();
        return new CardPage();
    }
//    public ErrorLoginPage notValidLogin(DataHelper.AuthInfo info) {
//        loginField.setValue(info.getLogin());
//        passwordField.setValue(info.getPassword());
//        loginButton.click();
//        return new ErrorLoginPage();
//    }
}
