package ict4apps.pages;

import  ict4apps.Locators;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@DefaultUrl("http://88.198.7.89:8100/")
public class DictionaryPage extends PageObject {

    List<String> languagesList = new ArrayList<>();


    String first = "4"; ////// FIRST
    String third = "6"; ////// THIRD
    String fifth = "8"; ////// THIRD


/////////////////////////// CLICK //////////////////////////////////////////////////////////////////////////////////////

    public WebElement linkWithStr(String arg0) {
        return $(Locators.WELCOME_HEADER_NAVIGATION_LINKS.replace("$1", arg0));
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

//////////////////////////////////      MOVE        ////////////////////////////////////////////////////////////////////

    public void moveAction(String arg0) {
        Actions actions = new Actions(getDriver());
        if (arg0.equals("first")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", first))).build().perform();
            waitABit(1500);
        } else if (arg0.equals("third")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", third))).build().perform();
            waitABit(1500);
        } else if (arg0.equals("fifth")) {
            actions.moveToElement($(Locators.BLOCK_PICTURE.replace("$1", fifth))).build().perform();
            waitABit(1500);
        }
    }

//////////////////////////////////      FIRST/SECOND/THIRD        //////////////////////////////////////////////////////

    public boolean titleWithStr(String arg0, String food) {

        String init = "";  ///// initialization
        String f = "1";
        String g = "2";

        if (arg0.equals("first")) {
            init = Locators.TITLE.replace("$1", food).replace("$2", f);
        } else if (arg0.equals("third")) {
            init = Locators.TITLE.replace("$1", food).replace("$2", g);
        } else if (arg0.equals("fifth")) {
            init = Locators.TITLE.replace("$1", food).replace("$2", g);
        }
        return $(init).isPresent();
    }

    public boolean moreIsDisplayed(String arg0, String more) {

        String init = "";

        if (arg0.equals("first")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", first);
        } else if (arg0.equals("third")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", third);
        } else if (arg0.equals("fifth")) {
            init = Locators.MORE_LINK.replace("$1", more).replace("$2", fifth);
        }
        return $(init).isPresent();
    }

    public boolean descriptionIsDisplayed(String arg0) {

        String init = "";

        if (arg0.equals("first")) {
            init = Locators.DESCRIPTION.replace("$1", first);
        } else if (arg0.equals("third")) {
            init = Locators.DESCRIPTION.replace("$1", third);
        } else if (arg0.equals("fifth")) {
            init = Locators.DESCRIPTION.replace("$1", fifth);
        }
        return $(init).isPresent();
    }

///////////////////////////////////     CLICK SCROLL BUTTON     ///////////////////////////////////////////////////////

    public void clickScrollButton(String direction, String arg0) {

        String ourSpecOff = "1";
        String foodDeliveryBox = "2";
        String review = "3";
        String next = "Next";
        String previous = "Previous";

        String init = "";

        if (arg0.equals("OUR SPECIAL OFFERS")) {
            init = Locators.SCROLL_BUTTON.replace("$1", ourSpecOff);
        } else if (arg0.equals("FOOD DELIVERY BOXES TO THE OFFICE OR HOME")) {
            init = Locators.SCROLL_BUTTON.replace("$1", foodDeliveryBox);
        } else if (arg0.equals("Review")) {
            init = Locators.SCROLL_BUTTON.replace("$1", review);
        }

        if (direction.equals("right")) {
            init = init.replace("$2", next);
        } else if (direction.equals("left")) {
            init = init.replace("$2", previous);
        }

        $(init).click();
        waitABit(1500);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void clickBlog(String arg0) {

        String element = "";

        if (arg0.equals("First")) {
            element = Locators.BLOG_LIST.replace("$1", "1");
        } else if (arg0.equals("Third")) {
            element = Locators.BLOG_LIST.replace("$1", "3");
        } else if (arg0.equals("Fifth")) {
            element = Locators.BLOG_LIST.replace("$1", "5");
        }

        $(element).click();

    }

    public boolean viewOriginalPostLinkIsPresented(String arg0, String arg1) {
        return $(Locators.LINKS.replace("$1", arg0)).isPresent();
    }

    public boolean readMoreLinkIsPresented(String arg0, String arg1) {
        return $(Locators.LINKS.replace("$1", arg1)).isPresent();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void getListOfLanguages() {
        List<WebElementFacade> list = findAll(Locators.LANGUAGES);
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void moveToPicture(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(Locators.FOOD_DELIVERY_PICTURES.replace("$1", arg0))).build().perform();
        waitABit(1500);
    }

    public boolean checkThatTitleIsDisplayed(String arg0,String arg1) {
        return $(Locators.PICTURE_TITLE.replace("$1", arg0)).getText().equalsIgnoreCase(arg1);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






}

