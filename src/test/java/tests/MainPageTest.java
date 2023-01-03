package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pageObject.MainPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the main page of the site")
public class MainPageTest extends Base {
    MainPage mainPage = new MainPage();

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(1)
    @DisplayName("SignUp field in the CFD banner. Trade Now button")
    public void checkSingUP_CFD_BtnTN (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.choiceBannerCFD();
        mainPage.clickBtnTN();
        mainPage.checkSingUpForm();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(2)
    @DisplayName("SignUp field in the CFD banner. Practice for free button")
    public void checkSingUP_CFD_BtnPFF (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.choiceBannerCFD();
        mainPage.clickBtnPFF_CFD();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(3)
    @DisplayName("SignUp field in the Discover Pro Trading banner. Start Trading button. ASIC")
    public void checkSingUP_BP_BtnST () {
        open("https://capital.com/?license=ASIC");
        mainPage.choiceBannerPRO();
        mainPage.clickBtnSTPRO();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(4)
    @DisplayName("Most traded.")
    @Description("SignUp form in the interactive widget table")
    public void checkMTR (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_MTR();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(5)
    @DisplayName("Commodities.")
    @Description("SignUp form in the interactive widget table")
    public void checkCOM (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_COM();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(6)
    @DisplayName("Indices.")
    @Description("SignUp form in the interactive widget table")
    public void checkIND (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_IND();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(7)
    @DisplayName("Crypto.")
    @Description("SignUp form in the interactive widget table")
    public void checkCRYP (String license, String logLicense) {
        open(license);
        String log = logLicense;
        if (!log.equals("FCA")) // There is no Сrypto in the FCA license
            mainPage.checkTabsNav_CRYP();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(8)
    @DisplayName("Shares.")
    @Description("SignUp form in the interactive widget table")
    public void checkSHAR (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_SHAR();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(9)
    @DisplayName("Forex.")
    @Description("SignUp form in the interactive widget table")
    public void checkFX (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_FX();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(10)
    @DisplayName("ETFs.")
    @Description("SignUp form in the interactive widget table")
    public void checkETF (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTabsNav_ETF();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(11)
    @DisplayName("SignUp field in the Still Looking For banner")
    public void checkCreateBtn (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.clickBtnCreateStillLookingFor();
        mainPage.checkSingUpForm();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(12)
    @DisplayName("SignUp field in the Slider Fade banner")
    public void checkSliderFade (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTradeBtnSliderFade();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(13)
    @DisplayName("SignUp field in the Explore our platform banner")
    public void checkTryNowBtnEOP (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.clickBtnTryNowExploreOurPlatform();
        mainPage.checkSingUpForm();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(14)
    @DisplayName("SignUp field in the banner New to trading?")
    public void checkPracForFreeBtnNewToTR (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.clickBtnPractiseForFreeNewToTrading();
        mainPage.checkSingUpForm();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(15)
    @DisplayName("SignUp field in the Calculator banner")
    public void checkStartTradBtnCalc (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.clickBtnStartTradingCalc();
        mainPage.checkSingUpForm();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(16)
    @DisplayName("SignUp field in the Trader's Dashboard banner")
    public void checkTradeBtnTradeDashb (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.checkTradeBtnTrDashb();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(17)
    @DisplayName("SignUp field in the banner Why choose Capital.com?")
    public void checkTryNowBtnWhyCC (String license, String logLicense) {
        open(license);
        String log = logLicense;
        mainPage.clickBtnTryNowWhyCapCom();
        mainPage.checkSingUpForm();
    }

}