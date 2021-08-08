package tests;

import org.junit.jupiter.api.Test;
import pages.TelekomPage;

public class TelekomTests {
    String URL = "https://deutschetelekomitsolutions.ru/";

    TelekomPage telekomPage = new TelekomPage();

    @Test
    public void openTelecomPageTest(){
        telekomPage.openPage(URL);
        telekomPage.checkPageTitle();

    }

}
