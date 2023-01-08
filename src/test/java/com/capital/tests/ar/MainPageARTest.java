package com.capital.tests.ar;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import com.capital.pageObject.HeaderPage;
import com.capital.pageObject.OldMainPage;
import com.capital.Base;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Check the login and registration buttons on the main page. (Arabic)")
public class MainPageARTest extends Base {
    OldMainPage oldMainPage = new OldMainPage();
    HeaderPage headerPage = new HeaderPage();

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(1)
    @DisplayName("Check the site header. Login form.")
    public void checkLogin (String license, String logLicense) {
        open(license);
        String log = logLicense;
        headerPage.loginFieldFormAppears();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(2)
    @DisplayName("Check the site header. SignUp form.")
    public void checkSingUp (String license, String logLicense) {
        open(license);
        String log = logLicense;
        headerPage.singUpFieldFormAppears();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(3)
    @DisplayName("SignUp form in the main banner. Create Account button.")
    public void checkSignUPFormClickBtnCreateAccountMainBanner(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnCreateAccountMain();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(4)
    @DisplayName("SignUp form in the main banner. Try Demo button.")
    public void checkSignUPFormClickBtnTryDemoMainBanner(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnTryDemo();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(5)
    @DisplayName("SignUp form in the interactive widget table. Most traded.")
    public void checkSignUPFormInTheInteractiveWidgetTableMTR(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_MTR();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(6)
    @DisplayName("SignUp form in the interactive widget table. Commodities.")
    public void checkSignUPFormInTheInteractiveWidgetTableCOM(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_COM();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(7)
    @DisplayName("SignUp form in the interactive widget table. Indices.")
    public void checkSignUPFormInTheInteractiveWidgetTableIND(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_IND();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(8)
    @DisplayName("SignUp form in the interactive widget table. Crypto.")
    public void checkSignUPFormInTheInteractiveWidgetTableCRYP(String license, String logLicense){
        open(license);
        String log = logLicense;
        if (!log.equals("FCA")) // There is no Сrypto in the FCA license
            oldMainPage.checkTabsNav_CRYP();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(9)
    @DisplayName("SignUp form in the interactive widget table. Shares.")
    public void checkSignUPFormInTheInteractiveWidgetTableSHAR(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_SHAR();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(10)
    @DisplayName("SignUp form in the interactive widget table. Forex.")
    public void checkSignUPFormInTheInteractiveWidgetTableFX(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_FX();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(11)
    @DisplayName("SignUp form in the interactive widget table. ETFs.")
    public void checkSignUPFormInTheInteractiveWidgetTableETFs(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.checkTabsNav_ETF();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(12)
    @DisplayName("SignUp form when clicking on the Start Trade button.")
    public void checkSignUPFormClickBtnTradeNow(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnStartTrade();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(13)
    @DisplayName("SignUp form when clicking on the Create Account button.")
    public void checkSignUPFormClickBtnCreateAccount(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnCreateAccount();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(14)
    @DisplayName("SignUp form when clicking on the Try Now button.")
    public void checkSignUPFormClickBtnTryNow(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnTryNow();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(15)
    @DisplayName("SignUp form when clicking on the Create Account button(StoreMob).")
    public void checkSignUPFormClickBtnCreateAccountEconomic(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnCreateAccountEconomic();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(16)
    @DisplayName("SignUp form when clicking on the Practice for free button.")
    public void checkSignUPFormClickBtnPracticeForFree(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnPracticeForFree();
        oldMainPage.checkSignUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/LicenceAR.csv")
    @Order(17)
    @DisplayName("SignUp form when clicking on the Create Account button(Statistics).")
    public void checkSignUPFormClickBtnCreateAccountStatistics(String license, String logLicense){
        open(license);
        String log = logLicense;
        oldMainPage.clickBtnCreateAccountStatistics();
        oldMainPage.checkSignUpForm();
    }

}
