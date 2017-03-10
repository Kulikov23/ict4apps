package ict4apps.pages;

import  ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://88.198.7.89:8100/")
public class DictionaryPage extends PageObject {

    String first = "4"; ////// FIRST
    String second = "5"; ////// SECOND
    String third = "6"; ////// THIRD


/////////////////////////// CLICK ////////////////////////////////////////////////

    public WebElement linkWithStr(String arg0) {
        return $(Locators.WELCOME_HEADER_NAVIGATION_LINKS.replace("$1", arg0));
    }

/////////////////////////// CLICK ////////////////////////////////////////////////

    public WebElement siteLogoIsAppeares() {
        return $(Locators.SITE_LOGO);
    }

    public WebElement titleDisplayed() {
        return $(Locators.TITLE_1ST_BLOCK);
    }

    public WebElement labelDisplayed() {
        return $(Locators.SHOWING_RESULTS_LABEL);
    }

    public WebElement blogsHeaderDisplayed() {
        return $(Locators.BLOGS_HEADER);
    }

    public WebElement contactsHeader_displayed() {
        return $(Locators.CONTACTS_HEADER);
    }

//////////////////////////////////      MOVE        ////////////////////////////////////////////////////

    public void moveAction(String arg0) {
        Actions actions = new Actions(getDriver());
        if (arg0.equals("first")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", first))).build().perform();
            waitABit(1500);
        } else if (arg0.equals("second")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", second))).build().perform();
            waitABit(1500);
        } else if (arg0.equals("third")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", third))).build().perform();
            waitABit(1500);
        }
    }

//////////////////////////////////      FIRST/SECOND/THIRD        ////////////////////////////////////////////////////

    public boolean titleWithStr(String arg0,String food) {

        String init = "";  ///// initialization
        String f = "1";
        String g = "2";

        if (arg0.equals("first")) {
            init = Locators.TITLE.replace("$1", food).replace("$2",f);
        } else if (arg0.equals("second")) {
            init = Locators.TITLE.replace("$1", food).replace("$2",f);
        } else if (arg0.equals("third")) {
            init = Locators.TITLE.replace("$1", food).replace("$2",g);
        }
        return $(init).isPresent();
    }

    public boolean moreIsDisplayed(String arg0, String more) {

        String init = "";

        if (arg0.equals("first")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", first);
        } else if (arg0.equals("second")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", second);
        } else if (arg0.equals("third")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", third);
        }
        return $(init).isPresent();
    }

    public boolean descriptionIsDisplayed(String arg0) {

        String init = "";

        if (arg0.equals("first")) {
            init = Locators.DESCRIPTION.replace("$1", first);
        } else if (arg0.equals("second")) {
            init = Locators.DESCRIPTION.replace("$1", second);
        } else if (arg0.equals("third")) {
            init = Locators.DESCRIPTION.replace("$1", third);
        }
        return $(init).isPresent();
    }
}