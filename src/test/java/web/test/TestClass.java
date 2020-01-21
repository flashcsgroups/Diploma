package web.test;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.val;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import web.data.DataHelper;
import web.page.CardPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestClass {
    private SelenideElement form;

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура за наличные' одобренной картой")
    void shouldApprovedBayCashCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getValidCardNumber();
        val cashBayPage = cardPage.validCashCard(authInfo);
        Thread.sleep(20000);
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура в кредит' одобренной картой")
    void shouldApprovedBayCreditCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getValidCardNumber();
        val cashBayPage = cardPage.validCreditCard(authInfo);
        Thread.sleep(20000);
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура за наличные' неодобренной картой")
    void shouldDeclinedBayCashCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getNotValidCardNumber();
        val cashBayPage = cardPage.validCashCard(authInfo);
        Thread.sleep(20000);
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура за наличные' неодобренной картой")
    void shouldDeclinedBayCreditCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getNotValidCardNumber();
        val cashBayPage = cardPage.validCreditCard(authInfo);
        Thread.sleep(20000);
    }



    @Step("Запуск формы 'Карта с доставкой'")
    private void openForm() {
        open("http://localhost:8080");
        form = $(By.className("App_appContainer__3jRx1"));
    }



//    @Test
//    void shouldTransferMoneyFromCardOneToCardTwoValidLogin() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getValidAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
//        val dashboardPage = verificationPage.validVerify(verificationCode);
//        val balanceCardTwoBeforeTransfer = dashboardPage.balanceCardTwo();
//        val replenishmentPage = dashboardPage.depositButtonV2Click();
//        val cardInfo = DataHelper.getCardV2Transfer();
//        val returnDashboardPage = replenishmentPage.validAmount(cardInfo);
//        returnDashboardPage.dashboardPageVisible();
//        val valueTransfer = replenishmentPage.amountTransfer(cardInfo);
//        val balanceCardTwoAfterTransfer = dashboardPage.balanceCardTwo();
//        assertEquals(balanceCardTwoBeforeTransfer + valueTransfer, balanceCardTwoAfterTransfer);
//    }
//
//    @Test
//    void shouldTransferMoneyExcessBalance() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getValidAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
//        val dashboardPage = verificationPage.validVerify(verificationCode);
//        val balanceCardOneBeforeTransfer = dashboardPage.balanceCardOne();
//        val replenishmentPage = dashboardPage.depositButtonV2Click();
//        val cardInfo = DataHelper.getCardV2ExcessBalanceTransfer();
//        replenishmentPage.excessBalanceTransfer(cardInfo);
//        val valueTransfer = replenishmentPage.amountTransfer(cardInfo);
//        val balanceCardOneAfterTransfer = dashboardPage.balanceCardOne();
//        assertEquals(balanceCardOneBeforeTransfer - valueTransfer, balanceCardOneAfterTransfer >= 0);
//    }
//
//    @Test
//    void shouldTransferMoneyExcessBalanceErrorPage() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getValidAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
//        val dashboardPage = verificationPage.validVerify(verificationCode);
//        dashboardPage.balanceCardOne();
//        val replenishmentPage = dashboardPage.depositButtonV2Click();
//        val cardInfo = DataHelper.getCardV2ExcessBalanceTransfer();
//        val errorPage = replenishmentPage.excessBalanceTransfer(cardInfo);
//        assertEquals("Error page should be shown", errorPage.errorPageVisible());
//    }
//
//    @Test
//    void shouldErrorPageWhenInputNotValidLogin() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getNotValidAuthInfo();
//        val verificationPage = loginPage.notValidLogin(authInfo);
//        verificationPage.errorLoginPageText();
//        assertEquals("Ошибка\nОшибка! Неверно указан логин или пароль", verificationPage.errorLoginPageText());
//    }
//
//    @Test
//    void shouldErrorPageWhenTransferMoneyFromAnyNumberCard() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getValidAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
//        val dashboardPage = verificationPage.validVerify(verificationCode);
//        val replenishmentPage = dashboardPage.depositButtonV2Click();
//        val cardInfo = DataHelper.getCardV2FromOtherNumberCard();
//        val errorPage = replenishmentPage.notValidCardNumber(cardInfo);
//        assertEquals("Ошибка", errorPage.errorPageText());
//    }
}
