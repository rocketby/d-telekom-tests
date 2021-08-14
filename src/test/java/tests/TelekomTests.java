package tests;

import org.junit.jupiter.api.Test;
import pages.TelekomPage;

public class TelekomTests extends BaseTest {
    String URL = "https://deutschetelekomitsolutions.ru/";

    TelekomPage telekomPage = new TelekomPage();

    @Test
    public void openMainPageTest() {
        telekomPage.openPage(URL);
        telekomPage.checkPageTitle();
        telekomPage.checkMainPageContent();
    }

    @Test
    public void openCompanyInfoTest() {
        telekomPage.openPage(URL);
        telekomPage.openCompanyInfo();
        telekomPage.checkCompanyInformation();
    }

    @Test
    public void openContactsTest() {
        telekomPage.openPage(URL);
        telekomPage.openContactsPage();
        telekomPage.checkContacts();
    }

    @Test
    public void findVacancyTest() {
        String idOfSpecialization = "42"; //QA
        String specialization = "QA";
        telekomPage.openPage(URL);
        telekomPage.openVacanciesInfo();
        telekomPage.checkDescriptionVacanciesPage();
        telekomPage.chooseSpecialization(idOfSpecialization);
        telekomPage.filterVacanciesByOptions();
        telekomPage.checkSearchVacanciesResults(specialization);
    }

    @Test
    public void searchOnSiteTest() {
        String textToBeFound = "QA Engineer";
        telekomPage.openPage(URL);
        telekomPage.clickButtonToOpenSearch();
        telekomPage.enterTextForSearch(textToBeFound);
        telekomPage.checkSearchResults(textToBeFound);

    }
}
