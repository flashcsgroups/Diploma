package web.test;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.val;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import web.data.DataHelper;
import web.data.CleanTables;
import web.page.CardPage;

import java.sql.SQLException;

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
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура в кредит' одобренной картой")
    void shouldApprovedBayCreditCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getValidCardNumber();
        val cashBayPage = cardPage.validCreditCard(authInfo);
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура за наличные' неодобренной картой")
    void shouldDeclinedBayCashCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getNotValidCardNumber();
        val cashBayPage = cardPage.validCashCard(authInfo);
    }

    @Test
    @DisplayName("Тестирование формы 'Покупка тура за наличные' неодобренной картой")
    void shouldDeclinedBayCreditCard() throws InterruptedException {
        openForm();
        CardPage cardPage = new CardPage();
        val authInfo = DataHelper.getNotValidCardNumber();
        val cashBayPage = cardPage.validCreditCard(authInfo);
    }



    @Step("Запуск формы 'Карта с доставкой'")
    private void openForm() {
        open("http://localhost:8080");
        form = $(By.className("App_appContainer__3jRx1"));
    }

    @AfterEach
    public void cleanTables() throws SQLException {
        CleanTables.cleanTables();
    }
}
