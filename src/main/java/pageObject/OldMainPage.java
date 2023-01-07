package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OldMainPage {

    private static final SelenideElement SCROLL_ELM_BANNER = $(byCssSelector(".banner--video.bDefault"));
    private static final SelenideElement CREATE_AC_MAIN_BTN = $(byCssSelector(".btn.btn--darkText.hideSm.__cp_b.__cp_bs.ln-auto"));
    public static final SelenideElement TRY_DEMO_BTN = $(byCssSelector(".btn.btn--empty.ln-auto._demo.__cp_b.__cp_bs"));

    private static final SelenideElement SCROLL_ELM_TAB_LIST  = $(byCssSelector(".row-cont.bg-fca > .text-center"));

    private static final SelenideElement TABS_NAV_MTR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Most']"));
    private static final SelenideElement TABS_NAV_COM = $(byXpath("//div[@class='tab-list ']/a[@data-type='Commodities']"));
    private static final SelenideElement TABS_NAV_IND = $(byXpath("//div[@class='tab-list ']/a[@data-type='Indices']"));
    private static final SelenideElement TABS_NAV_CRYP = $(byXpath("//div[@class='tab-list ']/a[@data-type='Crypto']"));
    private static final SelenideElement TABS_NAV_SHAR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Shares']"));
    private static final SelenideElement TABS_NAV_FX = $(byXpath("//div[@class='tab-list ']/a[@data-type='Forex']"));
    private static final SelenideElement TABS_NAV_ETF = $(byXpath("//div[@class='tab-list ']/a[@data-type='ETFs']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_MTR = $$(byXpath("//div[@class='tools__list ihome-Most']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_COM = $$(byXpath("//div[@class='tools__list ihome-Commodities']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_IND = $$(byXpath("//div[@class='tools__list ihome-Indices']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_CRYP = $$(byXpath("//div[@class='tools__list ihome-Crypto']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_SHAR = $$(byXpath("//div[@class='tools__list ihome-Shares']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_FX = $$(byXpath("//div[@class='tools__list ihome-Forex']//a[@data-type='wdg_markets']"));
    private static final ElementsCollection COLLECTION_TRADE_BTN_ETF = $$(byXpath("//div[@class='tools__list ihome-ETFs']//a[@data-type='wdg_markets']"));

    private static final SelenideElement SCROLL_ELM_START_TRADE_BTN = $(byCssSelector("#tools"));
    private static final SelenideElement START_TRADE_BTN = $(byXpath("//a[@class='button-main js_signup hidden-small'][@data-type='hp_choose_capital']"));

    private static final SelenideElement SCROLL_ELM_CREATE_AC_BTN  = $(byCssSelector(".tradingView.tradingView--oldpages.grey"));
    private static final SelenideElement CREATE_AC_BTN = $(byXpath("//div[@data-type='hp_test42_0']"));

    private static final SelenideElement SCROLL_ELM_TRY_NOW_BTN  = $(byCssSelector(".js-videoPlay.videoBl"));
    private static final SelenideElement TRY_NOW_BTN = $(byXpath("//a[@class='button-main hidden-small js_signup ']"));

    private static final SelenideElement SCROLL_ELM_CREATE_AC_EC_BTN  = $(byXpath("//a[@class='video-overlay __cp_b __cp_bs']"));
    private static final SelenideElement CREATE_AC_EC_BTN = $(byXpath("//a[@class='button-main rounded-lg __cp_b __cp_bs']"));

    private static final SelenideElement SCROLL_ELM_PRACTICE_FF_BTN  = $(byXpath("//div[@class='newToTrade__img']"));
    private static final SelenideElement PRACTICE_FF_BTN = $(byXpath("//a[@class='button-outlined rounded js_signup __cp_b']"));

    private static final SelenideElement SCROLL_ELM_CREATE_AC_STATISTIC_BTN  = $(byXpath("//ul[@class='slick-dots']"));
    private static final SelenideElement CREATE_AC_STATISTIC_BTN = $(byXpath("//a[@class='counter__btn button-main outlined-light rounded-lg js_signup __cp_bs ln-auto js-analyticsVisible']"));

    private static final SelenideElement CHECK_SING_UP_FORM = $(byCssSelector(".signup-form"));
    private static final SelenideElement CLOSE_SING_UP_FORM = $(byCssSelector(".button-cleared.small.s_cancel"));

    public void scroll (){
        SCROLL_ELM_BANNER.scrollTo();
    }

    @Step("The appearance of the SignUp form")
    public void checkSignUpForm() {
        CHECK_SING_UP_FORM.shouldBe(Condition.visible);
        CLOSE_SING_UP_FORM.click();
    }

    @Step("Click on the Create Account button")
    public void clickBtnCreateAccountMain (){
        SCROLL_ELM_BANNER.scrollTo();
        CREATE_AC_MAIN_BTN.click();
    }
    @Step("Click on the Try Demo Account button")
    public void clickBtnTryDemo (){
        SCROLL_ELM_BANNER.scrollTo();
        TRY_DEMO_BTN.click();
    }

    @Step("Checking the Most Traded tab")
    public void checkTabsNav_MTR () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_MTR.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_MTR)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the Commodities tab")
    public void checkTabsNav_COM () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_COM.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_COM)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the Indices tab")
    public void checkTabsNav_IND () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_IND.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_IND)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the Crypto tab")
    public void checkTabsNav_CRYP () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_CRYP.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_CRYP)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the Shares tab")
    public void checkTabsNav_SHAR () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_SHAR.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_SHAR)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the Forex tab")
    public void checkTabsNav_FX () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_FX.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_FX)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }
    @Step("Checking the ETFs tab")
    public void checkTabsNav_ETF () {
        SCROLL_ELM_TAB_LIST.scrollTo();
        TABS_NAV_ETF.click();
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRADE_BTN_ETF)
            if(selenideElement.isDisplayed()) {
                selenideElement.shouldBe(Condition.visible).click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.shouldBe(Condition.visible).click();
            }
    }

    @Step("Click on the Start Trade button")
    public void clickBtnStartTrade(){
        SCROLL_ELM_START_TRADE_BTN.scrollTo();
        START_TRADE_BTN.click();
    }
    @Step("Click on the Create Account button")
    public void clickBtnCreateAccount (){
        SCROLL_ELM_CREATE_AC_BTN.scrollTo();
        CREATE_AC_BTN.click();
    }
    @Step("Click on the Try Now button")
    public void clickBtnTryNow (){
        SCROLL_ELM_TRY_NOW_BTN.scrollTo();
        TRY_NOW_BTN.click();
    }
    @Step("Click on the Create Account button")
    public void clickBtnCreateAccountEconomic (){
        SCROLL_ELM_CREATE_AC_EC_BTN.scrollTo();
        CREATE_AC_EC_BTN.click();
    }
    @Step("Click on the Practice for free button")
    public void clickBtnPracticeForFree (){
        SCROLL_ELM_PRACTICE_FF_BTN.scrollTo();
        PRACTICE_FF_BTN.click();
    }
    @Step("Click on the Create Account button")
    public void clickBtnCreateAccountStatistics (){
        SCROLL_ELM_CREATE_AC_STATISTIC_BTN.scrollTo();
        CREATE_AC_STATISTIC_BTN.click();
    }

}
