package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pageObject.HeaderPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the site header")
public class HeaderPageTest extends Base {
    HeaderPage headerPage = new HeaderPage();

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(1)
    @DisplayName("Login field.")
    public void checkLogin (String license, String logLicense) {
        open(license);
        String log = logLicense;
        headerPage.loginFieldFormAppears();
    }

    @ParameterizedTest(name = "{1}")
    @CsvFileSource(resources = "/Licence.csv")
    @Order(2)
    @DisplayName("SignUp field.")
    public void checkSingUp (String license, String logLicense) {
        open(license);
        String log = logLicense;
        headerPage.singUpFieldFormAppears();
    }
}
