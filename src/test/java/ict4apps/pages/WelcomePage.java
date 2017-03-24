package ict4apps.pages;

import ict4apps.Locators;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@DefaultUrl("http://88.198.7.89:8100/")
public class WelcomePage extends PageObject {

    public void back() {
        getDriver().navigate().back();
    }

    List<String> languagesList = new ArrayList<>();

//TODO:///////////////////////////////////         SITE LOGO            ////////////////////////////////////////////////

    public void clickOnTheSiteLogo(String arg0) {
        $(Locators.WELCOME_PAGE_SITE_LOGO.replace("$1", arg0)).click();
    }

    public boolean checkThatPageIsRefreshed(String arg0) {
        return getDriver().getCurrentUrl().contains("http://88.198.7.89:8100/web/guest/" + arg0);
    }

    public boolean checkThatSiteLogoIsAppears(String arg0) {
        return $(Locators.WELCOME_PAGE_SITE_LOGO.replace("$1", arg0)).isVisible();
    }

//TODO:///////////////////////////////////         SEARCH BUTTON            ////////////////////////////////////////////

    public void clickOnTheSearch() {
        $(Locators.WELCOME_PAGE_SEARCH_BUTTON).click();
    }

    public boolean checkThatSearchPageIsOpened() {
        return getDriver().getCurrentUrl().contains("search");
    }
    public boolean checkThatSearchPageContainsSearchBth() {
        return $(Locators.WELCOME_PAGE_SEARCH_BUTTON).isVisible();
    }

//TODO:////////////////////////////         NAVIGATION LINKS            ////////////////////////////////////////////////

    public WebElement linkWithStr(String arg0,String arg1) {
        return $(Locators.WELCOME_PAGE_NAVIGATION_LINKS.replace("$1", arg0).replace("$2",arg1));
    }

    public boolean checkThatPageIsOpened(String arg0) {
        boolean x = getDriver().getCurrentUrl().contains(arg0);
        getDriver().navigate().back();
        return x;
    }

//TODO:///////////////////////////////////////      SIGN IN       //////////////////////////////////////////////////////

    public void clickOnTheSignInLink(String arg0) {
        $(Locators.WELCOME_PAGE_SIGN_IN_LINK.replace("$1", arg0)).click();
    }

    public boolean loginPageIsOpened(String arg0) {
        return getDriver().getCurrentUrl().contains(arg0);
    }

    public boolean pageContainsSignInButton(String arg0) {
        return $(Locators.WELCOME_PAGE_SIGN_IN_BUTTON.replace("$1", arg0)).isVisible();
    }


    public void clickOnTheLinkedImageOnTheBox(String arg0, String arg1) {
        $(Locators.WELCOME_PAGE_DOWNLOAD_MOBILE_VER_BOX_LINKS.replace("$1", arg1).replace("$2", arg0)).click();
    }

    public boolean checkThatAppDownloadPagePageIsOpened(String arg0) {
        return getDriver().getCurrentUrl().contains(arg0);
    }

    public boolean checkThatPageWithOurAppIsOpened(String arg0) {
        boolean x = $(Locators.WELCOME_PAGE_GOOGLE_PLAY_OR_APPSTORE_TITLE.replace("$1", arg0)).isVisible();
        getDriver().navigate().back();
        return x;
    }

//TODO:////////////////////////////////         OUR SPECIAL OFFERS          ////////////////////////////////////////////

    public void moveAction(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(Locators.WELCOME_PAGE_PRODUCT_BLOCK_PICTURE.replace("$1", arg0))).build().perform();
        waitABit(1500);
    }

    public boolean titleWithStr(String arg0) {
        return $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_TITLE.replace("$1", arg0)).isVisible();
    }

    public boolean descriptionIsDisplayed(String arg0) {
        return $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_DESCRIPTION.replace("$1", arg0)).isVisible();
    }

    public boolean moreIsDisplayed(String arg0, String arg1) {
        return $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_MORE_LINK.replace("$1", arg1).replace("$2", arg0)).isVisible();
    }

    public void clickOnTheFirstBlockContainsTitle(String arg0) {
        $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_TITLE.replace("$1", arg0)).click();
    }

    public boolean checkThatPageOfOurProductIsOpened(String arg0) {
        return getDriver().getCurrentUrl().contains(arg0);
    }

    public void clickOnTheLinkOfTheBlock(String arg0, String arg1) {
        $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_MORE_LINK.replace("$1", arg0).replace("$2", arg1)).click();
    }

//TODO://///////////////////////////     CLICK SCROLL BUTTON      //////////////////////////////////////////////////////

    public void clickScrollButton(String direction, String arg0) {
        $(Locators.WELCOME_PAGE_SCROLL_BUTTON.replace("$2", direction).replace("$1", arg0)).click();
        waitABit(1500);
    }

//TODO://////////////////////////////////           BLOGS LIST             /////////////////////////////////////////////

    public void clickBlog(String arg0) {
        $(Locators.WELCOME_PAGE_BLOG_LIST.replace("$1", arg0)).click();
    }

    public boolean viewOriginalPostLinkIsPresented(String arg0, String arg1) {
        return $(Locators.LINKS.replace("$1", arg0)).isPresent();
    }

    public boolean readMoreLinkIsPresented(String arg0, String arg1) {
        return $(Locators.LINKS.replace("$1", arg1)).isPresent();
    }

//TODO://////////////////////////////////          LANGUAGE LIST            ////////////////////////////////////////////

    public void getListOfLanguages() {
        List<WebElementFacade> list = findAll(Locators.WELCOME_PAGE_LANGUAGES);
        for (WebElement element : list) {
            languagesList.add(element.getText());
        }
    }

    public boolean checkCorrectOrderTheLanguages(Map<Integer, String> arg0) {
        for (String aLanguagesList : languagesList) {
            if (aLanguagesList.equalsIgnoreCase(String.valueOf(arg0))) {
                return false;
            }
        }
        return true;
    }

//TODO://////////////////////////////////           FOOD DELIVERY BOXES             ////////////////////////////////////

    public void moveToPicture(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(Locators.WELCOME_PAGE_FOOD_DELIVERY_PICTURES.replace("$1", arg0))).build().perform();
        waitABit(1500);
    }

    public boolean checkThatTitleIsDisplayed(String arg0, String arg1) {
        return $(Locators.WELCOME_PAGE_FOOD_DELIVERY_PICTURE_TITLE.replace("$1", arg0)).getText().equalsIgnoreCase(arg1);
    }

    public void clickOnTheProductPic(String arg0) {
        $(Locators.WELCOME_PAGE_FOOD_DELIVERY_PICTURES.replace("$1", arg0)).click();
        back();
    }

    public boolean checkThatPageIsOpenedWithOurChosenCategory(String arg0) {
        return getDriver().getCurrentUrl().contains("http://88.198.7.89:8100/web/guest/" + arg0);
    }

//TODO://///////////////////////////////      READ MORE ABOUT US       /////////////////////////////////////////////////

    public boolean checkThatPageContainsHeader(String arg0) {
        return $(Locators.WELCOME_PAGE_READ_MORE_ABOUT_US_TITLE.replace("$1", arg0)).isVisible();
    }

//TODO:////////////////////////////////////////      FOOTER       //////////////////////////////////////////////////////

    public void clickingOnTheSocialNetworkIcon(String arg0) {
        $(Locators.WELCOME_PAGE_FOOTER.replace("$1",arg0)).click();
    }



}

