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

    List<String> languagesList = new ArrayList<>();

//TODO:////////////////////////////         NAVIGATION LINKS            ////////////////////////////////////////////////

    public WebElement linkWithStr(String arg0) {
        return $(Locators.WELCOME_PAGE_NAVIGATION_LINKS.replace("$1", arg0));
    }

    public boolean checkThatPageIsOpened(String arg0) {
        boolean x = getDriver().getCurrentUrl().contains(arg0);
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
        return $(Locators.WELCOME_PAGE_PRODUCT_BLOCK_MORE_LINK.replace("$1", arg1).replace("$2",arg0)).isVisible();
    }

//TODO://///////////////////////////     CLICK SCROLL BUTTON      //////////////////////////////////////////////////////

    public void clickScrollButton(String direction, String arg0) {
             $(Locators.WELCOME_PAGE_SCROLL_BUTTON.replace("$2", direction).replace("$1",arg0)).click();
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

}

