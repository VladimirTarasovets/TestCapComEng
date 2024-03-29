package com.capital;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.capital.pageObject.HeaderPage.COOKIE;


public class Base {

    @BeforeAll
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        Configuration.browserCapabilities = options;
        open("https://capital.com");
        COOKIE.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }

    @AfterAll
    @Step("Closing the browser")
    public void tearDown() {
        closeWebDriver();
    }
}
