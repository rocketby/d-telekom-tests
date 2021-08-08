package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TelekomPage {
    private final static String PAGE_TITLE = "DEUTSCHE TELEKOM IT SOLUTIONS";

    @Step("Open main page")
    public void openPage(String URL) {
        open(URL);
    }

    @Step("Check telekom page title")
    public void checkPageTitle() {
        $(".header-top__text").shouldHave(text(PAGE_TITLE));
    }
}
