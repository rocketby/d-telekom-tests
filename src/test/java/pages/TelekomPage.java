package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class TelekomPage {
    private final static String PAGE_TITLE = "DEUTSCHE TELEKOM IT SOLUTIONS";
    private final static String MAIN_PAGE_CONTENT = "Работаем над проектами";
    private final static String COMPANY_DESCRIPTION = "Deutsche Telekom IT Solutions – международная IT-компания";
    private final static String VACANCY_PAGE_DESCRIPTION = "Присоединяйся";

    @Step("Open main page")
    public void openPage(String URL) {
        open(URL);
    }

    @Step("Check telekom page title")
    public void checkPageTitle() {
        $(".header-top__text").shouldHave(text(PAGE_TITLE));
    }

    @Step("Check content of the Main Page")
    public void checkMainPageContent() {
        $(withText(MAIN_PAGE_CONTENT)).shouldBe(visible);
    }

    @Step("Open page with company information")
    public void openCompanyInfo() {
        $x("//header//*[text()='О нас']").hover();
        $x("//header//*[text()='О компании']").click();

    }

    @Step("Check, that company description is correct")
    public void checkCompanyInformation() {
        $(withText(COMPANY_DESCRIPTION)).shouldBe(visible);
    }

    @Step("Open page with vacancies")
    public void openVacanciesInfo() {
        $x("//header//*[text()='Карьера']").hover();
        $x("//header//*[text()='Вакансии']").click();

    }

    @Step("Check, that description at vacancies page is correct")
    public void checkDescriptionVacanciesPage() {
        $(withText(VACANCY_PAGE_DESCRIPTION)).shouldBe(visible);
    }

    @Step("Choose specialization")
    public void chooseSpecialization(String idOfSpecialization) {
        $(".vacancies__btn.vacancies__btn--specialization").click();
        $x(format("//*[@class='vacancies__wrap-top']//input[@value='%s']", idOfSpecialization)).click();
    }

    @Step("Filter vacancies by chosen options")
    public void filterVacanciesByOptions() {
        $(byName("set_filter")).click();
    }

    @Step("Check, that found vacancies match set search options")
    public void checkSearchVacanciesResults(String specialization) {
        $(".vacancies__result").shouldHave(text(specialization));
    }

    @Step("Open contact page")
    public void openContactsPage() {
        $x("//header//*[text()='Контакты']").click();
    }

    @Step("Check, that contacts are displayed")
    public void checkContacts() {
        $x("//a[contains(@href, 't-systems.ru')]").shouldBe(visible);
    }


    @Step("Click search button")
    public void clickButtonToOpenSearch() {
        $("#searchBut").click();
    }

    @Step("Enter text, that should be found on page")
    public void enterTextForSearch(String textToBeFound) {
        $x("//*[@id='searchInp']//*[@name='q']").sendKeys(textToBeFound);
        $x("//*[@id='searchInp']//*[@name='q']").submit();
    }

    @Step("Check search results")
    public void checkSearchResults(String textToBeFound) {
        $(".search-page").shouldHave(text(textToBeFound));
    }

}
