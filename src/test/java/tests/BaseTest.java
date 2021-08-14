package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Attach;

import static java.lang.String.format;

import static config.Credentials.credentials;


public class BaseTest {
    @BeforeAll
    static void setup() {
        String login = credentials.login();
        String password = credentials.password();
        String runMode = credentials.runMode();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.startMaximized = true;

        //if need to execute tests in selenoid, then use command:
        //gradle clean test -Durl=selenoid.autotests.cloud/wd/hub/ -DrunMode = remote

        //if need to execute tests locally, use command:
        //gradle clean test

        if  (System.getProperty("runMode", runMode).equals("remote")) {
            Configuration.remote = format("https://%s:%s@" + System.getProperty("url"), login, password);
        }
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }
}